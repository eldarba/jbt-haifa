package f.animals;

public class Test {

	public static void main(String[] args) {
		Animal dog = () -> {
			System.out.println("woof");
		};
		Animal cow = () -> {
			System.out.println("moo");
		};
		Animal cat = () -> {
			System.out.println("miau");
		};

		dog.speak();
		cow.speak();
		cat.speak();

		// invoke other interface methods
		dog.work();
		Animal.sayHi();
	}
}
