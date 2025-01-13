package Java8Concepts;

import java.util.Optional;

public class OptionalEmpty {

	public static void main(String[] args) {
		Optional<String> optionalEmpty = Optional.empty();
		if(optionalEmpty.isEmpty()) {
			System.out.println("optional is empty");
		}else {
			System.out.println("optional is not empty");
		}
	}

}
