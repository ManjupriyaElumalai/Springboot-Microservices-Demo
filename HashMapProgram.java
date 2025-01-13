package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapProgram {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "manju");
		map.put(2, "priya");
		map.put(2, "nila");
		map.put(3, "manju");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println("getkey.."+ entry.getKey() + "getvalue..."+ entry.getValue());
		}
		
	}

}
