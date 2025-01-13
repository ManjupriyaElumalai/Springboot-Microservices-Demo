package OopsConcepts;

public class AbstractionMain extends AbstractionClass{

	public static void main(String[] args) {
		AbstractionMain ab = new AbstractionMain();
		ab.engine();
		ab.message();
	}

	@Override
	void engine() {
		System.out.println("It's running..!!");
	}

}
