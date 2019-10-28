package a;

class Foo {

	static {
		System.out.println(">>> Foo static initializer");
	}
}

public class Demo2Initialization {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Hello");
		Class<?> clazz;

		// no initialization
		clazz = Foo.class;
		System.out.println(clazz);

//		// initialization
//		clazz = Class.forName("a.Foo");
//		System.out.println(clazz);

		// no initialization
		clazz = Class.forName("a.Foo", false, Foo.class.getClassLoader());
		System.out.println(clazz);
	}

}
