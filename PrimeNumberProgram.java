package InteractionInterviewQuestions;

public class PrimeNumberProgram {

	// In tamil prime no means -> paaga yen, which means will divided by 1 or the name no itself that is prime no
	public static void main(String[] args) {
		int num =6;
//		int i =2;
//		boolean primeNo = true;
//		while(i<num) {
//			if(num%i==0) {
//				System.out.println("not prime num");
//				
//				primeNo = false;
//				i=i+1;
//			}
//		}
//		if(primeNo == true) {
//			System.out.println("It prime no");
//		}

		int m,flag =0;
		m=num/2;
		for(int i=2;i<=m;i++) {
			if(num%i==0) {
				System.out.println("Is not a prime no"+ num);
				flag =1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+ "is a prime num");
		}
	}

}
