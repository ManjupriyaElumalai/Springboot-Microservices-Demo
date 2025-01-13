package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setconcepts {

	// HashSet, LinkeHashSet, TreeSet
	// It doesn't maintain the insertion order, store only one null value, not allowed the duplicates,
	// It contains unique items,
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Manju");
		set.add("priya");
		set.add("Manju");
		set.add("udhaya");
		set.add(null);
		set.add(null);
		System.out.println("result.."+ set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println("output..."+ itr.next());
		}
		
		//LinkedHashSet
		// It maintain the insertion order, store only one null value, not allowed the duplicates,
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		lh.add("Manju");
		lh.add("priya");
		lh.add("Manju");
		lh.add("udhaya");
		lh.add(null);
		lh.add(null);
		System.out.println("result.."+ lh);
		Iterator itr1 = lh.iterator();
		while(itr1.hasNext()) {
			System.out.println("output..."+ itr1.next());
		}
		
		
		//TreeSet
		// It stored the elements in assending orders,
		// Like HashSet, TreeSet also contains unique elements. 
		//However, the access and retrieval time of TreeSet is quite fast.
		TreeSet<String> tree = new TreeSet<String>();
//		tree.add(null);
		tree.add("Manju");
		tree.add("priya");
		tree.add("Manju");
		System.out.println("result.."+ tree);
		Iterator itr2 = tree.iterator();
		while(itr2.hasNext()) {
			System.out.println("output..."+ itr2.next());
		}
	}

}
