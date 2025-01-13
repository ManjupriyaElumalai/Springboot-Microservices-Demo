package InterviewQuestions;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		int num = 3553, reversedNumber = 0, reminder;
		int orginal = num;
		while(num != 0) {
			reminder = num%10;
			reversedNumber = reversedNumber*10 + reminder;
			num /= 10;
			System.out.println(num + " result");
		}
		if(orginal == reversedNumber) {
			System.out.println(orginal + " is Palindrome.");
		}else {
			System.out.println(orginal + " is not a Palindrome ");
		}
	}

}
