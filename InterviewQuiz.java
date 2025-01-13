package Java8Samples;

import java.util.ArrayList;
import java.util.Optional;

public class InterviewQuiz {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(50);
		l.add(200);
		//print max or min number in arraylist
		Optional<Integer> o = 
				l.stream().min((no1,no2)-> no1.compareTo(no2));
		System.out.println(o.get());
	
	
	l.stream().forEach(System.out::println); // it print order value
	l.parallelStream().forEach(System.out::println); //it print randam value
	System.out.println("order value");
	l.parallelStream().forEachOrdered(System.out::println); //its print order value from array
	
	
	}

}
