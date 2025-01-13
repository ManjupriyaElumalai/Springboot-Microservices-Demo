package Java8Concepts;

import java.util.ArrayList;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		ArrayList<Integer> el = new ArrayList<Integer>();
		el.add(20);
		el.add(1);
		el.add(3);
		el.add(30);
		el.add(21);
		
		el.stream().forEach(System.out::println); // it's mention the order
		
		el.parallelStream().forEach(System.out::println); // here very fast so no order is mention
		
		el.parallelStream().forEachOrdered(System.out::println); // if we need order wise means we can use it
 	}

}
