package d;

public class Hello {

	int i = 3;

	public static void main(String[] args) {
		Object hello = new Hello();
		hello.toString();
	}

	@Override
	public String toString() {
		System.out.println("Hello");
		return "Hello";
	}

}
