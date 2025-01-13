package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListConceptsPrograms {

	public static void main(String[] args) {
		// ArrayList
		// 1. maintain insertion order & store duplicate values & store null values
		ArrayList<String> al = new ArrayList<String>();
		al.add("Manju");
		al.add("priya");
		al.add("Manju");
		al.add("priya");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println("result"+ al);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println("final..."+ i.next());
		}
		
		
		//LinkedList 
		// 1. maintain insertion order & store duplicate values & store null values
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hel");
		ll.add("hel");
		ll.add("nila");
		ll.add("gopi");
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add(null);
		System.out.println("result2..."+ ll);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println("final2..."+ itr.next());
		}
	}

}
