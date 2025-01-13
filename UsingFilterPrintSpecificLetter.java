package Java8InterviewPracticeQuiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
	String name;
	@Override
	public String toString() {
		return "name=" + name + " age=" + age ;
	}
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age  = age;
	}
}
public class UsingFilterPrintSpecificLetter {

	
	// Write a Java program to filter a list of strings to get only those which start with a specific letter using Java 8 streams.
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Manju", 20);
		Student s2 = new Student("Maya", 20);
		Student s3 = new Student("Maina", 22);
		Student s4 = new Student("Gopi", 24);
		Student s5 = new Student("Govind", 25);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		students.forEach(System.out::println);
		
		List<Student> specificLetters = students.stream().filter(letter-> letter.name.startsWith("M")).collect(Collectors.toList());
		System.out.println(specificLetters);
		
		// simple example
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .collect(Collectors.toList());
        System.out.println(filteredNames);
	}

}
