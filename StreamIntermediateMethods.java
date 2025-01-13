package Java8Concepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class StreamIntermediateMethods {

	public static void main(String[] args) {
	
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(20);
		set.add(15);
		set.add(30);
//		set.stream().forEach(System.out::println);
//		set.stream().limit(4).skip(2).forEach(System.out::println);
		Optional<Integer> result = set.stream().reduce((el1, el2) -> (el1+el2)); // it will print the total value
		System.out.println(result.get());
		
		Integer res = set.stream().reduce((el1, el2) -> (el1+el2)).orElse(0); // it will print the total value and another way
		System.out.println(res);
		
		int max = set.stream()
                .reduce((a, b) -> a > b ? a : b)
                .orElse(Integer.MIN_VALUE);
		System.out.println("Max: " + max);
		
		List<String> strings = Arrays.asList("A", "B", "C", "D");

        // Using reduce(BinaryOperator<T> accumulator)
        String concatenatedString1 = strings.stream()
                                            .reduce((a, b) -> a + b)
                                            .orElse("");

        // Using reduce(T identity, BinaryOperator<T> accumulator)
        String concatenatedString2 = strings.stream()
                                            .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated String1: " + concatenatedString1); // Output: Concatenated String1: ABCD
        System.out.println("Concatenated String2: " + concatenatedString2); // Output: Concatenated String2: ABCD
	}

}
