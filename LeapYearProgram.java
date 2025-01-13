package InteractionInterviewQuestions;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {
		//divided by 4 is leap, not divided by 100 is a leap year, divided by 400 is a leap year
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a leap year: ");
		int year = sc.nextInt();
		if(year%4==0) {
//			System.out.println("It's a leap year");
			if(year%100==0) {
//				System.out.println("It's a leap year");
				if(year%400==0) {
					System.out.println("It's a leap year");
				}else {
					System.out.println("It's not a leap year");
				}
			}else {
				System.out.println("It's a leap year");
			}
		}
		else {
			System.out.println("It's not a leap year");
		}
	}

}
