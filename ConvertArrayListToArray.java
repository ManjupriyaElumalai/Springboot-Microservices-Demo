package Java8Concepts;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(5);
		a.add(20);
		a.add(10);
		
		// convert arraylist to array
		Object[] ob = a.
				stream().
				sorted().
				toArray();
		
		for(Object o: ob) {
			System.out.println( o);
		}
	}

}
