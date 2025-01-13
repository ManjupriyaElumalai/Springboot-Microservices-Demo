package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "hello");
		m.put(2, "welcome");
		m.put(3, "manju");
//		String d = "";
		for(Map.Entry v: m.entrySet()) {
			System.out.println("key"+ v.getKey()+ "value"+ v.getValue());
			if(v.getValue() == "manju") {
				System.out.println("Hello "+ v.getValue() +"..!!!");
			}else {
				System.out.println("Hello new customer...!!");
			}
		}
		
		//Try to store duplicate key in hashmap
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "hello");
		h.put(2, "welcome");
		h.put(3, "manju");
		h.put(3, "manju");
		for(Map.Entry d: h.entrySet()) {
			System.out.println(d.getKey()+ "" + d.getValue());
		}
		
		//putIfAbsent method
		
		h.putIfAbsent(4, "gopi");
		for(Map.Entry d: h.entrySet()) {
			System.out.println(d.getKey()+ "" + d.getValue());
		}
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(5, "udhaya");
		hm.putAll(h);
		for(Map.Entry d: hm.entrySet()) {
			System.out.println("final"+d.getKey()+ "" + d.getValue());
		}

		
		
		
		

		
	}

}
