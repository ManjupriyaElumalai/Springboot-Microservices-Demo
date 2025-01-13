package SteamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStartWith {

	public static void main(String[] args) {
		String arr[] = {"Angular", "Python", "Action", "Java", "React"};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Angular");
		arrayList.add("Python");
		arrayList.add("Action");
		arrayList.add("Java");
		arrayList.add("React");
//		arrayList.stream().filter(names -> names.startsWith("A").forEach(res -> System.out.println(res.arrayList)));
//				map(p -> p.startsWith("A")).collect(Collectors.toList());		
//				forEach(res -> System.out.println(res.toUpperCase()));
//		System.out.println("respnse"+ arrayList);
//				
	}

}
