package InteractionInterviewQuestions;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class SumOfNaturalNumbers {

	// sum of natural number means 3 = 1+2+3 = 6, 4 = 1+2+3+4 =10
	public static void main(String[] args) {
//		int sumofnatural =0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the natural number: ");
//		int num = sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			sumofnatural = sumofnatural +i;
//			
//		}
//		System.out.println("sum of "+ num+ " natural num is "+ sumofnatural);
		var intArray = new int[]{1, 2, 3, 4, 5};
		int sum =0;
        for(int i=0; i<intArray.length;i++){
            sum = intArray[i] + sum;
        }
        System.out.println("Total sum of value is:" +sum);
        
        
        OptionalDouble result = Arrays.stream(intArray).average();
        System.out.println(result);
	}

}
