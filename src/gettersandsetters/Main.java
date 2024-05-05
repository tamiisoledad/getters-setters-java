package gettersandsetters;

public class Main {

	public static void main(String[] args) {
		User user = new User("Tamara", "123456");
		
		System.out.println(user.getName());
		
		user.setName("Soledad");
		
		System.out.println(user.getName());
	}

}
