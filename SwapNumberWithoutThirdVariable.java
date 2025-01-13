package InteractionInterviewQuestions;

import java.util.Scanner;

public class SwapNumberWithoutThirdVariable {

	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println(a+ "and" + b);
		
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a and b value :");
		a = s.nextInt();
		b = s.nextInt();
		
		a = a+b;
		b = a-b;
		a = a -b;
		System.out.println(a+ "and" + b);
	}

}
