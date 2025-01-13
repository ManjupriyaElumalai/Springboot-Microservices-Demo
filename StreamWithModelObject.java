package Java8Samples;

import java.util.ArrayList;
import java.util.Optional;

public class StreamWithModelObject {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2000, 30000, 2, "Manju"));
		emp.add(new Employee(2810, 40000, 3, "Priya"));
		emp.add(new Employee(2900, 50000, 10, "Mithuna"));
		emp.add(new Employee(2990, 80000, 12, "Anitha"));
		emp.
		stream()
		.filter(f-> f.exp > 3 && f.salary > 50000)
		.map(m -> m.getName())
		.forEach(System.out::println);
//		.forEach(s-> System.out.println(s.getName()));
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(40);
		a.add(60);
		Optional<Integer> b = a.stream().reduce((a1,a2) -> a1+a2);
		System.out.println(b.get());
		
		//converting arraylist to array
		Object[] obj = a.stream().toArray();
		for(Object o: obj)
			System.out.println(o);
	}

}
