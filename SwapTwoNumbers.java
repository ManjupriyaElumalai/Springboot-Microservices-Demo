package InteractionInterviewQuestions;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
//		Scanner ca = new Scanner(System.in);
		System.out.println("Enter the value of X and Y: ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before swapping"+ x + y);
		z = x;
		x = y;
		y = z;
		System.out.println("after swap"+ x + y);
		
	}

}
