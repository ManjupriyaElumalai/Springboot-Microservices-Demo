package InteractionInterviewQuestions;

import java.util.Scanner;

public class CheckEvenNumberOddNumber {

	
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any number: ");
		a = sc.nextInt();
		if(a%2==0) {
			System.out.println("given number is even");
		}else {
			System.out.println("given number is odd");
		}
	}

}
