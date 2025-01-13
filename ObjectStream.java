package Java8Concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	int age;
	String name;
	double salary;
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public Employee(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class ObjectStream {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee st = new Employee(22, "Joo", 30000);
		al.add(new Employee(20, "Manju", 50000));
		al.add(new Employee(30, "Priya", 80000));
		al.add(new Employee(27, "Gopi", 9000));
		al.add(new Employee(28, "Nisha", 40000));
		al.add(new Employee(27, "Majeeth", 18000));
		al.add(st);
//		al.stream().filter(a -> a.age >22).map(m-> m.name.toUpperCase()).forEach(e-> System.out.println(e));
		System.out.println("result 2");
		List<String> namelist = al.stream().
		map(m-> m.name.toUpperCase()).collect(Collectors.toList());
		System.out.println("result 2"+ namelist);
		al.stream().
		map(m-> m.name.toUpperCase()).forEach(System.out::println);
		
		//print high salary
		al.stream().filter(sal -> sal.salary > 50000).forEach(System.out::println);
		
		// if you want to print 2nd highest salary from emp list means use below logic and use skip(1)  method
		Optional<Double> sal = al.stream().map(salary -> salary.salary).sorted((Collections.reverseOrder())).skip(1).findFirst();
		System.out.println("salary  "+ sal.get());
		
		//if you want to print first low salary means use below logic
		Optional<Double> lowsal = al.stream().map(ss-> ss.salary).sorted().findFirst();
		System.out.println("1st low salary->"+ lowsal.get());
		
		//if you want to print 2nd low salary means use below logic
				Optional<Double> secordsal = al.stream().map(ss-> ss.salary).sorted().skip(1).findFirst();
				System.out.println("2nd low salary->"+ secordsal.get());
		
		// if you want to print only reverse order means use this logic
		al.stream().map(salary -> salary.salary).sorted((Comparator.reverseOrder())).forEach(System.out::println);
		
		//if you want to print only reverse order of 1st 2 values means you can use limit method
		al.stream().map(salary -> salary.salary).sorted((Comparator.reverseOrder())).limit(2).forEach(System.out::println);
		
		
	}

}
