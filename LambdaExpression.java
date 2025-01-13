package Java8Samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.forEach ((a) -> {System.out.println(a);} );
		
		
		//use consumer
		Consumer<Integer> method = (n) -> {System.out.println(n);};
		al.forEach(method);
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(3);
		arr.add(6);
		Collections.sort(arr);
		arr.forEach( s -> {
			System.out.println("output"+s);
		});
	}

}
