package ScannerClass;

import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter userName:");
		String username = s.nextLine();
		System.out.println("UserName is.."+ username);
		if((username).toString() == "manju") {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
	}

}
