package a;

public class Demo3Wrappers {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Hello");
		Class<?> clazz;

		clazz = Integer.TYPE;
		System.out.println(clazz);

		clazz = Boolean.TYPE;
		System.out.println(clazz);

		clazz = Void.TYPE;
		System.out.println(clazz);

	}

}
