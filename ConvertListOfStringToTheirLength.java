package Java8InterviewPracticeQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToTheirLength {

	
	// Write a Java program to convert a list of strings to a list of their lengths using Java 8 streams.
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Manju", "M", "BB", "CC", "D", "ABC");
		List<Integer> result = list.stream().map(String::length).collect(Collectors.toList());
		System.out.println(result);
	}

}
