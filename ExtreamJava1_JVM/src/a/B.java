package a;

public class B {

	// compile time constant
	public static final int A = 5;
	public static final int B = (int) (Math.random() * 10);
	public static int a = 5;

	// static initializer
	static {
		System.out.println("B loaded");
	}
	

}


