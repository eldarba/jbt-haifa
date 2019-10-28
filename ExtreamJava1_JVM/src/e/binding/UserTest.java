package e.binding;

public class UserTest {

	// compile time constant
	public static final int MAX = 250;

	public static void main(String[] args) {
		// String literal
		System.out.println("Hello from Eldar");
		// int literal
		int someVal = 123123;
		someVal = 45454545;

		User user = new Staff();
		user.instanceMethod(someVal);
		user.instanceMethod(MAX);
		user.instanceMethod(555);
		User.staticMethod();
	}
}
