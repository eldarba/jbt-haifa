package f.animals;

@FunctionalInterface
public interface Animal {

	// abstract method - only one is allowed in a functional interface
	void speak();

	// default method
	default void work() {
		System.out.println("default work");
	};

	// static method
	static void sayHi() {
		System.out.println("Hi");
	}

}
