package Java8Concepts;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("Hello World");
		if(opt.isPresent()) {
			System.out.println("value is present"+ opt.get());
		}else {
			System.out.println("value is not present");
		}
		
		
//		 String result = Optional.orElse("Default Value"); 
		 
//	        System.out.println("Result: " + result);
	}

}
