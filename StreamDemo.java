package Java8Samples;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	int id;
	String name;
	float salary;
	public StreamDemo(int id,String name, float salary) {
		this.id =id;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		List<StreamDemo> l = new ArrayList<StreamDemo>();
		l.add(new StreamDemo(1, "Manju", 40000));
		l.add(new StreamDemo(2, "Priya", 30000));
		l.stream().filter(m-> m.name=="Manju").forEach(s-> System.out.println(s.name+" is "+s.salary));
	}

}
