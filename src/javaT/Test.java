package javaT;

public class Test {	
	public static void main(String[] args) {
	try {
		
		System.out.println("--------------------------------------------------------");
		StringBuffer sb = new StringBuffer("buffer test !!!! ");
		System.out.println(sb.toString());
		sb.append(" test 1");
		System.out.println(sb.toString());
		sb.insert(1, "B");		
		System.out.println(sb.toString());
		sb.delete(0, 3);
		System.out.println(sb.toString());
		sb.setCharAt(0, 'b');
		System.out.println(sb.toString());
		System.out.println("-------------------------------------------------------");
//		myException();
//		myException2();
		
	}catch(Exception e) {
		System.out.println("1");
		e.getMessage();
		System.out.println("2");
		e.printStackTrace();
		System.out.println("3");
		System.out.println(e);
		System.out.println("4");
		e.toString();
	}
}
	
	private static void myException2() throws Exception   {
		// TODO Auto-generated method stub
		System.out.println("myException2 !!!!!!!!!!!!");
		throw new Exception();
	}
 
	@SuppressWarnings("finally")
	static public void myException() throws Exception {
		try {
			System.out.println("myException R U N  !!!!!!!!!!!!");
		} catch(Exception e) {
			e.printStackTrace();
			
			System.out.println("myException 예외 발생");
			
		} finally{
			throw new Exception();
		}
	}
}
//		int[] arr = {1,1,4,4,4,4,4,3,3,3,3,5,5};
//		
//        LinkedHashSet<Integer> test = new LinkedHashSet<>();
//        
//        for(int loop : arr) {
//        	test.add(loop);
//        }
//        System.out.println(test);
//	}
		
//		int n = 120;
//		int m = 54;
//
//	        int[] answer = new int[2];
//	        int big = Math.max(n, m);
//	        int small = Math.min(n, m);
//	        
//	        answer[0] = gcd(big, small);
//	        answer[1] = big*small/answer[0];
//	        
//	        System.out.println(answer[0]+","+answer[1]);
//	    }
//	    
//	    static int gcd(int a, int b) {
//	        if(a % b == 0) {
//	            return b;
//	        }
//	        return gcd(b, a%b);
//	    }

//	        int answer = 0;
//	        long num = 626331;
//	        while(true){
//	            if(num%2 == 0) num /= 2;
//	            else num = num*3+1;	            
//	            answer++;
//	            System.out.print(num+" ");
//	            if(num == 1) break;
//	        }
//	        System.out.println(answer);
//		 

//		try {
//			myException2();
//			myException();
//			
//		}catch(Exception e) {
//			System.out.println("MyClass 예외 발생");
//		}
//	}
//	static public void myException2() throws Exception {		
//			throw new Exception();		
//	}
//	
//	static public void myException() {
//		try {
//			throw new Exception();
//		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("myException 예외 발생");
//		}