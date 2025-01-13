package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ValueOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wrapper class object sort method
		ArrayList al = new ArrayList();
		al.add(123);
		al.add(Integer.valueOf(100));
		al.add(Integer.valueOf(200));
		al.add(99);
		System.out.println(al);
		Collections.sort(al);
		System.out.println("output..."+ al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("reverseOrder"+ al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
