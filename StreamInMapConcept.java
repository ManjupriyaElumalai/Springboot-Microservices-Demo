package Java8Concepts;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamInMapConcept {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Abi", 100);
		map.put("Mithuna", 200);
		map.put("Gopi", 101);
		map.put("Nive", 100);
		map.entrySet().stream().forEach(System.out::println);
		
		long v = map.entrySet().stream().count();
		System.out.println(v);
		
		
//		
		Optional<Integer> max = map.values().stream().max((el1, el2)-> el1.compareTo(el2));
		System.out.println("print max->"+ max.get());
//		
		Optional<Integer> min = map.values().stream().min((el1, el2)-> el1.compareTo(el2));
		System.out.println("print min->"+ min.get());
//		
		map.entrySet().stream().limit(2).skip(1).forEach(System.out::println);
//		
		Optional<String> sumOfName = map.keySet().stream().reduce((e1,e2)-> (e1+e2));
		System.out.println(sumOfName.get());
//		
		Optional<Integer> sumOfId = map.values().stream().reduce((e1,e2)-> (e1+e2));
		System.out.println(sumOfId.get());
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); // sorted by value
	
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // sorted by key
		
		
		Set<String> set = map.keySet().stream().collect(Collectors.toSet());
		System.out.println(set);
		
		List<Integer> list = map.values().stream().collect(Collectors.toList());
		System.out.println(list);
		
		Boolean data = set.stream().allMatch( p -> p.endsWith("i")); // terminal operations
		System.out.println(data);
		
		Boolean data1 = set.stream().anyMatch( p -> p.endsWith("i"));// terminal operations
		System.out.println(data1);
		
		Boolean data2 = set.stream().noneMatch( p -> p.endsWith("i"));// terminal operations
		System.out.println(data2);
		
		
	}

}
