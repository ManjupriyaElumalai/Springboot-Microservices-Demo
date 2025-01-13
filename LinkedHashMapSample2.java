package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample2 {

	int id;    
	String name,author,publisher;    
	int quantity;
	public LinkedHashMapSample2(int id, String name, String author, String publisher, int quantity){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	public static void main(String[] args) {
	Map<Integer,LinkedHashMapSample2> res = new LinkedHashMap<Integer, LinkedHashMapSample2>();
	LinkedHashMapSample2 b1 = new LinkedHashMapSample2(1, "manju", "Elumalai", "Nalini", 2);
	LinkedHashMapSample2 b2 = new LinkedHashMapSample2(2, "gopi", "Elumalai", "Nalini", 2);
	res.put(1, b1);
	res.put(2, b2);
	
	for(Map.Entry<Integer,LinkedHashMapSample2> entry: res.entrySet()) {
		int key = entry.getKey();
		LinkedHashMapSample2 l = entry.getValue();
		System.out.println("keys...."+ key);
		System.out.println("name.."+ l.name);
	}
	
	}

}
