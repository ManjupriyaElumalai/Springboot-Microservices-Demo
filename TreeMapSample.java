package Collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		NavigableMap<Integer, String> n = new TreeMap<Integer, String>();
		n.put(100, "M");
		n.put(104, "P");
		n.put(103, "V");
		n.put(102, "J");
		System.out.println("des.."+n.descendingMap());
		System.out.println("head..."+ n.headMap(102, true)); //lessthen and equal
		System.out.println("tail..."+  n.tailMap(102, true));//greater then and equal
		System.out.println("sub..."+ n.subMap(100,false, 104,false));//exsits and between
		}

}
