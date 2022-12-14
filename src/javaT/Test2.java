package javaT;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
	public static void main(String[] args) {
		String pt = "\\d+\\s+\\d+";
		
		Map<String, String> map = new HashMap<>();
		
		map.put("query", "1234");
		map.put("ivrCallData", "50123580912             1111");
		map.put("test", "120481029409");	
		map.put("test1234", "asdlgklkasdfjl");	
		
		for(String key : map.keySet()) {
			if("query".equals(key) || "ivrCallData".equals(key)) {
				if(key.equals("query")) pt = "\\d+";
				Pattern ptTest = Pattern.compile(pt);
				Matcher match = ptTest.matcher(map.get(key));
				
				
				while(match.find()) {
					
					if(match.group().length() > 2) {
						StringBuilder m3 = new StringBuilder(match.group());
						System.out.println(match.group());
						
							for(int j=0;j<match.group().length();j++) {
								m3.setCharAt(j, '*');									
							}					
						map.put(key, m3.toString());	
					}
				}
			}
		}
		System.out.println(map);
	}
}
