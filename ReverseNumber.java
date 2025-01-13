package InteractionInterviewQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void reverseNumber(int num) {
		if(num < 10) {
			System.out.println(num);
			return;
		}
		else {
			System.out.println(num%10);
			reverseNumber(num/10);
		}
	}
	public static void main(String[] args) {
		//using while loop step1
		// number, reverse =0, number/10
		int number = 987654321;
		int reverse =0;
		while(number!=0) {
			int remainder = number%10;
			reverse = reverse*10 + remainder;
			number = number/10;
		}
		System.out.println("The reverse is "+ reverse);
		
		//using forloop step2
		
//		for(;number!=0; number=number/10) {
//			int remainder = number%10;
//			 reverse = reverse*10 + remainder;
//			 
//		}
//		System.out.println(reverse);
		
		//step3 using recuration
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter any 4 digit number:");  
		int num = sc.nextInt();
		System.out.println("The reverse of the given number is: ");  
		reverseNumber(num);
		
	}

}
