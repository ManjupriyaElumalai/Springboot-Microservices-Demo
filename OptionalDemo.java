package Java8Concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class User{
	private String userName;
	private String email;
	
	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public User(String userName, String email) {
		this.userName = userName;
		this.email = email;
	}
}
class UserService {
	private List<User> users = Arrays.asList(new User("Manju", "mp96.10.08@gmail.com"),
			new User("Priya", "priya@gmail.com"));
	public Optional<User> getUserName(String userName){
		return users.stream().filter(name -> name.getUserName().equals(userName)).findFirst();
	}
	
	
}
public class OptionalDemo {

	public static void main(String[] args) {
		
		UserService userService = new UserService();
		
		Optional<User> res = userService.getUserName("Manju");
		res.ifPresent(user -> System.out.println("found user -> "+ user.getEmail()));
		
		Optional<User> res1 = userService.getUserName("Priiya");
		if(!res1.isEmpty()) {
			res1.ifPresent(user -> System.out.println("found user -> "+ user.getEmail()));
		} else {
			System.out.println("User not found");
		}
		
	}

}
