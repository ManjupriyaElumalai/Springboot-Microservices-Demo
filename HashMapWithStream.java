package Java8Samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapWithStream {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Manju", 100);
		hm.put("ABCD", 200);
		hm.put("BCDE", 400);
		hm.put("Priya", 250);
		// comparingByValue will print value based on order wise like 123
//		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(m -> System.out.println(m));
//		//comparingByKey will print order wise like ABC
//		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(m -> System.out.println(m));
//		
//		Set<String> v = hm.keySet().stream().collect(Collectors.toSet());
//		System.out.println(v);
//		
//		//print only values from map
//		List<Integer> vv = hm.values().stream().collect(Collectors.toList());
//		System.out.println(vv);
//		
//		List<String> l = hm.keySet().stream().collect(Collectors.toList());
//		System.out.println(l);
		
		
		//print list of names
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");
		System.out.println(names);
		List<String> results = names.stream().collect(Collectors.toList());
		System.out.println(results);
		
		String joinedNames = names.stream()
                .collect(Collectors.joining(", "));
System.out.println("Joined String: " + joinedNames);
		
		Set<String> namelist = names.stream().collect(Collectors.toSet());
		System.out.println(namelist);
		
		
		List<Integer> num = Arrays.asList(2, 3, 4, 4, 5);
		List<Integer> numres = num.stream().collect(Collectors.toList());
		System.out.println(numres);
		
//		Optional<Integer> maxva = num.stream().min((v1,v2)-> v1.compareTo(v2));
		Optional<Integer> maxva = num.stream().findFirst();
		System.out.println(maxva.get());
		
		//remove duplicates
		Set<Integer> val = num.stream().collect(Collectors.toSet());
		System.out.println(val);
		names.stream().map(m -> m.toUpperCase()).forEach(System.out::println);
		
		
		
		List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
System.out.println("Name Lengths: " + nameLengths);
	}

}
