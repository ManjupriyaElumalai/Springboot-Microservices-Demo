package Java8Samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
	
	int id;
	String name;
	float price;
	public StreamSample(int id,String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		List<StreamSample> l = new ArrayList<StreamSample>();
		l.add(new StreamSample(1,"manju", 100f));
		l.add(new StreamSample(1,"priya", 200f));
		l.add(new StreamSample(1,"nila", 300f));
		List<Float> d = l.stream().filter(p -> p.price > 100).map(c-> c.price).collect(Collectors.toList());
		System.out.println("res.."+ d);
		
		l.stream().filter(p -> p.price == 100).forEach(c -> System.out.println("your name"+c.name));
		
		List<Float> v = l.stream().filter(s -> s.price > 100).map(c-> c.price).collect(Collectors.toList());
		System.out.println("res1.."+ v);
	}

}
