package Java8Samples;

import java.util.ArrayList;
import java.util.List;

public class ListWithStream {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(40);
		l.stream().distinct().sorted().forEach(el -> System.out.println(el));
		l.stream().distinct().sorted((ele1,ele2)-> -1).forEach(v->System.out.println(v));
		
		//print decending order
		List<String> st = new ArrayList<String>();
		st.add("Elumalai");
		st.add("Gopi");
		st.add("Manju");
		st.add("Manju");
		st.add("Nalini");
		System.out.println("Accendng Order");
		st.stream().distinct().sorted().forEach(System.out::println);//accending order
		System.out.println("decending Order");
		st.stream().distinct().sorted((ele1,ele2)-> -1).forEach(v->System.out.println(v));
		
	}

}
