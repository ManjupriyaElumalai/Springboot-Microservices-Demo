package SteamApi;

import java.util.ArrayList;

public class StreamUsingForeach {

	int id;
	String name;
	int age;
	String dept;
	float sal;
	public StreamUsingForeach(int id, String name, int age, String dept, float sal) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.sal = sal;
	}
	public static void main(String[] args) {
		ArrayList<StreamUsingForeach> al = new ArrayList<StreamUsingForeach>();
		al.add(new StreamUsingForeach(1, "manju", 27, "system Analyst", 30000f));
		al.add(new StreamUsingForeach(2, "priya", 27, "system Analyst", 30000f));
		al.add(new StreamUsingForeach(3, "udhaya", 28, "Automatiovn Tester", 25000f));
		al.add(new StreamUsingForeach(4, "udhaya", 28, "Automation Tester", 35000f));
//		al.stream().filter(p -> p.name == "udhaya").
//		forEach(p -> System.out.println(p.sal));
		
		al.stream().filter(v-> v.name == "manju").forEach(v -> System.out.println("sal...."+v.sal));
	}
	

}
