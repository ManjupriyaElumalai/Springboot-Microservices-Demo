package Java8Samples;

interface Message{
	public void say();
}
public class LambdaExpression2 {

	public static void main(String[] args) {
		String msg = "Hello Manju! Welcome to Interaction Project";
		Message m = ()->{
			System.out.println("Congrats..!!"+ msg);
		};
		m.say();
	}

}
