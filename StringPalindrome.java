package InterviewQuestions;

public class StringPalindrome {

	public static void main(String[] args) {
		String real = "madam";
		boolean	palindromeCheck = false;
//		System.out.println("string is a"+ palindromeCheck);
//	}

//	public static boolean ispalindromeCheck(String str) {
//		int right = str.length()-1;
//		int left = 0;
//		while(left < right) {
//			if(str.charAt(left) != str.charAt(right)) {
//				return false;
//			}
//			left++;
//            right--;
//		}
//		return true;
		for(int i=0; i<real.length()-1;i--) {
			for(int j=0;i>j;j++) {
				if(real.charAt(i) != real.charAt(j)) {
					palindromeCheck = true;
				}
			}
		}
		if(palindromeCheck) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not palindrome");
		}
	}

}
