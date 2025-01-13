package InteractionInterviewQuestions;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElementInArray {

	public static void main(String[] args) {
		//max element
		int arr[] = {1,3,5,8,7,50,4,7};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("maximun element.."+ max);
		
//		//using stream
//		OptionalInt res = Arrays.stream(arr).max();
//		System.out.println("max.."+ res.getAsInt());
//		
//		//min element
//		int arrr[] = {1,3,5,8,7,50};
//		int min = arr[0];
//		for(int i=0;i<arrr.length;i++) {
//			if(arrr[i] < min) {
//				min = arrr[i];
//			}
//		}
//		System.out.println("minimun element.."+ min);
//		
//		//using stream
//		OptionalInt resp = Arrays.stream(arr).min();
//		System.out.println("min.."+ resp.getAsInt());
//		
//		//print 2nd largest element array
//		
//		Arrays.sort(arr);
//		int size = arr.length;
//		int result = arr[size-2];
//		System.out.println("2nd largest element is.."+result);
		
		
		int a[] = {2,0,4,5,20,40,4,5,30,70,8};
		int mx = a[0];
		for(int i=0;i<a.length; i++) {
			if(mx>a[i]) {
				mx = a[i];
			}
		}
		System.out.println("output"+ mx);
		
		
	}

}
