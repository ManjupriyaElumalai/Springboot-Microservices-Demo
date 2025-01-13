package Java8Concepts;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class ArraysStream {

	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 20, 3, 50,2,  4, 30, 6};
		Arrays.stream(arr).distinct().sorted().forEach(System.out::println);
		OptionalInt s = Arrays.stream(arr).max();
		System.out.println("Max num...."+s.getAsInt());
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("Min num...."+min.getAsInt());
		
		OptionalDouble average = Arrays.stream(arr).average();
		System.out.println("average value"+ average);
		
		Arrays.stream(arr).distinct().sorted().forEach(System.out::println); // remove duplicates
		
		System.out.println("even number");
		Arrays.stream(arr).sorted().filter(val -> val%2 ==0).forEach(v -> System.out.println(v));
		System.out.println("odd number");
		Arrays.stream(arr).sorted().filter(val -> val%1 ==0).forEach(v -> System.out.println(v));
		
		Arrays.stream(arr).sorted().filter(f -> f > 20).forEach(ss -> System.out.println("greater then 20..."+ss));
	}

}
