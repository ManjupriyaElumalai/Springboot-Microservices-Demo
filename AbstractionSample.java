package OopsConcepts;

 abstract class bike{
	 abstract void running();
 }
public class AbstractionSample extends bike{

	public static void main(String[] args) {
		bike n = new AbstractionSample();
		n.running();
	}

	@Override
	void running() {
		System.out.println("100km per speed...");
	}

}
