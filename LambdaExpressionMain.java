package Java8Concepts;

public class LambdaExpressionMain {

	public static void main(String[] args) {
//		LambdaExpression le = () -> System.out.println("Hello Manju..!! Welcome to CTS");
//		le.Message();
		
//		LambdaExpression le = (a, b)-> System.out.println(a*b);
//		le.add(20, 100);
		
		LambdaExpression le = (a, b) -> a+b;
		System.out.println(le.add(30, 70));
	}

}
