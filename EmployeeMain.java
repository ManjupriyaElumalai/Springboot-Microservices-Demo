package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Map<Integer, Employee> hmap = new HashMap<Integer, Employee>();
		Employee emp1 = new Employee(200, "Manju", "Java");
		Employee emp2 = new Employee(300, "Priya", "Testing");
		Employee emp3 = new Employee(400, "Anitha", "BA");
		hmap.put(1, emp1);
		hmap.put(2, emp2);
		hmap.put(3, emp3);
		hmap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "values...."+ entry.getValue()));
//		hmap.forEach((k, v)-> {
//			System.out.println("key"+ k + "val"+ v);
//		});
//		for(Map.Entry<Integer, Employee> emp: hmap.entrySet()) {
//			System.out.println("key"+ emp.getKey() + "value"+emp.getValue());
//		}
		
		var entriesAsStringList = hmap.entrySet().stream()
	            .map(entry -> entry.getKey() + " value: " + entry.getValue())
	            .collect(Collectors.toList());
	        
	        // Print the collected list
	        entriesAsStringList.forEach(System.out::println);
	}

}
