package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingSample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("manju");
		al.add("A");
		al.add("D");
		al.add("B");
		Collections.sort(al);
		System.out.println("output...."+ al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			
			System.out.println("res...."+ itr.next());
		}
	}

}
