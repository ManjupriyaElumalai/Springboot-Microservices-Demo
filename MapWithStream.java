package Java8Samples;

import java.util.ArrayList;
import java.util.List;

public class MapWithStream {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(500);
		List<Integer> aa = new ArrayList<Integer>();
		al.
		stream().
		map(m -> m==10).
		forEach(f-> System.out.println(f));

		//using string
		//*********interview quiz print name in uppercase using stream****************
		ArrayList<String> st = new ArrayList<String>();
		st.add("Manju");
		st.add("Priya");
		st.add("Udhaya");
		st.add("upmp");
		st.stream().map( m-> m.toUpperCase()).forEach(System.out::println);
		st.stream().map( m-> m.toLowerCase()).forEach(System.out::println);
		
	}

}
