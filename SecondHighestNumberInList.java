package Java8InterviewPracticeQuiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

public class SecondHighestNumberInList {

	
	// Write a Java program to find the second highest number in a list using Java 8 streams.
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 10, 20, 40, 30, 100, 50);
		list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
		
		Optional<Integer> lists = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(lists.get());
		lists.ifPresent(System.out::println);
	}

}
