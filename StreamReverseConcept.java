package Java8Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamReverseConcept {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("abcd");
		s.add("dbc");
		s.add("bc");
		s.add("zyx");
		s.stream().forEach(System.out::println); // print all the elements
		System.out.println("sorted order");
		s.stream().sorted().forEach(System.out::println);
		System.out.println("reverse sorted order");
		s.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		long c = s.stream().count();
		System.out.println("count...."+ c);
		s.stream().sorted((el1, el2)-> el2.compareTo(el1)).forEach(System.out::println);
		System.out.println("another way of print elements");
		s.stream().sorted((el1, el2)-> -123).forEach(System.out::println); //if use - values it print the decending order but not sorted
		s.stream().sorted((el1, el2)-> 1).forEach(System.out::println); //if use + values it print the accending order but not sorted
	}

}
