package Java8Concepts;

import java.util.ArrayList;

@FunctionalInterface
interface A{
	public void message();
}
public class MethodReferenceConcept {

	public void message() {
		System.out.println("Hello welcome back");
	}
	public static void main(String[] args) {
		MethodReferenceConcept m = new MethodReferenceConcept();
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.forEach(values -> System.out.println(values));
		al.forEach(System.out::println);
		A a = m::message;
		a.message();
//		System.out.println("output is..."+ a.message());
	}

}
