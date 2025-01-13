package InteractionInterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapConcepts {

	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer, String>();
		h.put(1, "manju");
		h.put(2, null);
		h.put(5, null);
		h.put(4, null);
		h.put(5, null);
		h.put(6, null);
		System.out.println(h);
		for(Map.Entry v: h.entrySet()) {
			System.out.println(v.getKey() +" "+ v.getValue());
		}
		
		LinkedHashMap<Integer,String> lh = new LinkedHashMap<Integer, String>();
		lh.put(1, "manju");
		lh.put(2, null);
		lh.put(5, null);
		lh.put(4, null);
		lh.put(5, null);
		lh.put(6, null);
		System.out.println(lh);
		for(Map.Entry v: lh.entrySet()) {
			System.out.println(v.getKey() +" "+ v.getValue());
		}
	}

}
