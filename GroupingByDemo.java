package Java8InterviewPracticeQuiz;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		   List<Employee> emp = new ArrayList<>();  
	        emp.add(new Employee("Dipak", "Delhi", 21));  
	        emp.add(new Employee("Sumit", "Delhi", 21));  
	        emp.add(new Employee("Karan", "Delhi", 23));  
	        emp.add(new Employee("Mona", "Udaipur", 23));  
	        emp.add(new Employee("Rajesh", "Banglore", 23));  
	        emp.add(new Employee("Dipak", "Banglore", 31));          
	        /* Group by Employees by city before Java 8 world */         
	        Map<String,List<Employee>> EmpByCity = new HashMap<>(); 
	        
	        
	        EmpByCity =  emp.stream().collect(Collectors.groupingBy(Employee::getCity));  
	        System.out.println("Employees grouped by cities in Java 8: " + EmpByCity);  
	        /* group Employees by age */  
	        Map<Integer,List<Employee>> EmpByAge = emp.stream().collect(Collectors.groupingBy(Employee::getAge));  
	        System.out.println("Employees grouped by age in Java 8: " + EmpByAge); 
	        
	        Map<String, List<Employee>> EmpName = emp.stream().collect(Collectors.groupingBy(Employee::getName));
	        System.out.println("Employees grouped by name in Java 8: " + EmpName); 
	    }  
	

}
