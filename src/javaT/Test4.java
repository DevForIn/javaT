package javaT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Testtest{	
	int max(int a,int b);
}
public class Test4 {
	public static void main(String[] args) {

		Testtest test = (int a, int b) -> a > b ? a : b;
		System.out.println(test.max(3,5));

		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
		 
		list.add("a");
		list.add("c");
		list.add("b");
		set.add("1");
		
		System.out.println(list);
		
		Stream<String> listStream = list.stream();
		
		System.out.println(listStream.toList());
	}
}