package Java8Concepts;

import java.util.*;

public class PrintMaxMinValueArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(200);
		list.add(100);
		list.add(300);
		list.add(10);
//		list.stream().forEach(System.out::println);
		
		// print max and min value from the arraylist
		
		Optional<Integer> max = list.stream().max((el1,el2) -> (el1.compareTo(el2)));
		System.out.println(max.get());
		
		
		Optional<Integer> min = list.stream().min((el1,el2) -> (el1.compareTo(el2)));
		System.out.println(min.get());
	}

}
