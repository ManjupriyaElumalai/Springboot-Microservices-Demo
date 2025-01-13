package Java8Samples;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayStream {

	public static void main(String[] args) {
		int arr[] = {1,2,4,6,7};
//		IntStream st = Arrays.stream(arr);
//		st.sorted();
//		System.out.println("output"+st);
//		st.forEach(System.out::println);
	//	step1
//		Arrays.stream(arr).sorted().forEach(a->System.out.println(a));
		//step2
//		Arrays.stream(arr).sorted().forEach(System.out::println);
//		st.forEach(no-> System.out.println(no));
		
		//average
		OptionalDouble st = Arrays.stream(arr).average();
		System.out.println(st.getAsDouble());
		
		//max or min
		OptionalInt op = Arrays.stream(arr).min();
		System.out.println(op.getAsInt());
		
		//findFirst
		OptionalInt ops = Arrays.stream(arr).findFirst();
		System.out.println(ops.getAsInt());
		
		//findAny
		OptionalInt opp = Arrays.stream(arr).findAny();
		System.out.println(opp.getAsInt());
		
		//count of elements
		long co = Arrays.stream(arr).count();
		System.out.println(co);
		
		//print unique elements of given array
		//*********Interview question***************
		// it will print only first occurance value
		int ar[] = {1,2,2,4,4,5,7,10};
		Arrays.stream(ar).distinct().forEach(ele -> System.out.println("unique elements"+ ele));
		Arrays.stream(ar).distinct().forEach(System.out::println);
		
		//print only even numbers
		System.out.println("evennumber");
		Arrays.stream(ar).filter(f-> f%1==0).forEach( System.out::println);
		
		
		
	}

}
