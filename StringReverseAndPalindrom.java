package Collections;
import java.util.*;  
import java.util.Scanner;

public class StringReverseAndPalindrom {

	public static void main(String[] args) {
		//string reverse
//		String word = "He is a good deed";
//		String wordNew ="";
//		for(int i=word.length()-1;i>=0;i--) {
////			System.out.println("result"+ i);
//			wordNew = wordNew + word.charAt(i);
//			System.out.println("result"+ wordNew);
//		}
//		if(word.equals(wordNew)) {
//			System.out.println("It's palindrom");
//		}else {
//			System.out.println("It's not a palindrom");
//		}
	
	
	//palindrom
	String orginal, reverse ="";
	Scanner in = new Scanner(System.in);
	orginal = in.nextLine();
	int length = orginal.length();
	for(int i= length-1;i>=0; i--) {
		reverse = reverse + orginal.charAt(i);
	}
	 if (orginal.equals(reverse)) {
		 System.out.println("Entered string/number is a palindrome.");   
	 }
        
      else {
    	  
         System.out.println("Entered string/number isn't a palindrome."); 
	}
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Entered input...");
	 String res = scan.nextLine();
//	 String rep = res.replaceFirst(0, 0);
	 
	}
}
