package Collections;

import java.util.HashMap;
import java.util.Map;

public class HMMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "manju");
		hm.put(2, "pr");
		for(Map.Entry m: hm.entrySet()) {
			System.out.println("key"+ m.getKey());
		}
		
		hm.putIfAbsent(3, "manju");
		for(Map.Entry m: hm.entrySet()) {
			System.out.println("key"+ m.getKey()+ "value"+ m.getValue());
		}
		
		hm.remove(1);
		System.out.println("entry"+ hm.entrySet());
		

	}

}
