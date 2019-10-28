package a;

public class Test {
	public static void main(String[] args) {

		String str = "AAA";
		Class<?> clazz = str.getClass();
		System.out.println(clazz);

		clazz = String.class;

		System.out.println(clazz.getClassLoader());
		System.out.println(Test.class.getClassLoader());

		try {
			clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		System.out.println(A.y);
//		System.out.println(A.x);
//		System.out.println("===");
//		System.out.println(B.B);
//		B.a = 10;
//		System.out.println(B.a);
//		System.out.println(B.B);

	}
}
