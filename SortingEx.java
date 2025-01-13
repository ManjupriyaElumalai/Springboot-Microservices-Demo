package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SortingEx {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(0);
		al.add(1);
		Collections.sort(al);
		System.out.println("output"+ al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Entered reverse order....!!");
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("reverse order-----+");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// normal array sort method 
		int [] arr = new int [] {100, 99, 200, 20,10};
		Arrays.sort(arr);
		Arrays.toString(arr);
		System.out.println("sorting...."+ arr);
		for(int i = 0; i< arr.length; i++) {
			System.out.println("arraylist"+ arr[i]);
			
		}
		
		//example
		int[] arrr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		System.out.println("Array elements after sorting:");
		Arrays.sort(arrr);

		for(int i =0; i < arrr.length; i++) {
			System.out.println("array result..."+ arrr[i]);
		}

		
		//ReverseOrder
		Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205}; 
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " +Arrays.toString(array));   

	}

}
