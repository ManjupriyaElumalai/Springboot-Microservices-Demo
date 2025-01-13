package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("manju", 100);
		hm.put("priya", 101);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println("entry"+ hm.entrySet());
		
		hm.remove("manju");
		System.out.println("entry"+ hm.entrySet());

	}

}
