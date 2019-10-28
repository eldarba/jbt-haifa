package a;

public interface A {

	int x = init();
	int y = 10;

	static int init() {
		System.out.println(">>> from init()");
		return 5;
	}

	public static void main(String[] args) {
		System.out.println("an interface can have a main method");
	}

}
