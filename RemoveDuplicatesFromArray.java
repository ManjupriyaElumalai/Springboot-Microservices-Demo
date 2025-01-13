package InteractionInterviewQuestions;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,3,4,2,5,3,5,4,88,67,5};
		Arrays.stream(a).sorted().distinct().forEach(System.out::println);
		
	}

}
