package javaT;

public class Test3 {
	public static void main(String[] args) {
		String qus = "^0100^0200^0300^0400^0500^0600^0700^0800^1800";
		
		String test1 = "^0100_1^1800_1^0200_2^"; 
		// "^0100_1^0200_1^";
		// "^"
		// "^0100_1^1800_1^0200_2"
		// -> ^0100_1^0300_2^0400_0^0500_0^0600_0^0700_0^0800_0^1800_1";
		String test3 = "^";
		// -> ^0100_0^0300_0^0400_0^0500_0^0600_0^0700_0^0800_0^1800_0^
		
		String[] qusList = qus.split("\\^");
		String[] testList1 = test1.split("\\^");
		String[] testList3 = test3.split("\\^");
		
		StringBuilder sbTest1 = new StringBuilder(test1);
		StringBuilder sbTest3 = new StringBuilder(test3);
		System.out.println("-----------------------------");
		
		String case1 = "";
		String case2 = "";
		String sb1 = "";
		
		if(test1.equals("^")) {
			for(int i=testList3.length+1;i<qusList.length;i++) {
				sbTest3.append(qusList[i]+"_0^");
			}
		}
		else {
			for(int i=1;i<qusList.length;i++) {		
				int cnt=0;
				
				for(int j=1;j<testList1.length;j++) {				
					String[] testAns = testList1[j].split("_");
					if(qusList[i].equals(testAns[0])) {
//						case1 = testList1[j]+"^";
						cnt = j;
						break;
					}				
				}
				if(cnt == 0) {
					sbTest1.append(qusList[i]+"_0^");
				}
			}
		}
		
//		if(case1.substring(0,4).equals("1800")) {
//			sb1 = sbTest1.toString();
//			System.out.println("sb1 >>>>>>>>>>>> " + sb1);
//			sb1=sb1.replace(case1,"")+case1;
//			System.out.println("sb1 변환 >>>>>>>> " + sb1); // 머시머시? 아 머시머시?
//
//		} else {
//			sb1 = sbTest1.toString();
//		}
		System.out.println("케이스 1 : 1800 답변 존재 >>>>>>>>> " + sbTest1);
		System.out.println("케이스 3 : ^ 만 있을때    >>>>>>>>> "+ sbTest3.toString());
		
	}
}
