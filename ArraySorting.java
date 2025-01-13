package InteractionInterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,4,3,8,0};
		//step1 normal sort
		Arrays.sort(arr);
//		for(int i=0; i<arr.length;i++) {
		for(int i : arr) 
			System.out.println("Numbers in order"+ i);
		
		
		//step2 using stream
//		Arrays.stream(arr).distinct().sorted().forEach(System.out::println);
		Arrays.stream(arr).distinct().sorted().forEach(f-> System.out.println(f));
		
		
		//step3 normal array sorting using forloop

		int arr1[] = new int[] {2,4,5,1,3,66,77,44,-98,0,-55};
		System.out.println("sorting elements are:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1; j<arr1.length;j++) {
				int tem =0;
				System.out.println(arr1[i] + "j val "+arr1[j]);
				if(arr1[i]> arr1[j]) {
					tem =arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tem;
				}
			}
		
		System.out.println(arr1[i]);
		}
	}

}
