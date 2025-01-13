package InteractionInterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		int n1=0,n2=1,n3,count=9;
		for(int i=0;i<=count;++i) {
			n3 =n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
