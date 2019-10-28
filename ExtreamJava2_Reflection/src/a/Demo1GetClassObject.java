package a;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Demo1GetClassObject {

	/*
	 * get access to the class object
	 */
	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> clazz;

		System.out.println("=============");
		// APPROACH 1: using the getClass() instance method
		clazz = "AAA".getClass();
		System.out.println(clazz);

		Set<String> set = new HashSet<String>();
		clazz = set.getClass();
		System.out.println(clazz);

		System.out.println("=============");
		// APPROACH 2: using static method Class.forName(String)
		clazz = Class.forName("java.lang.String");
		System.out.println(clazz);

		clazz = Class.forName("[D"); // one dim array of primitive double
		System.out.println(clazz);

		clazz = Class.forName("[[I"); // two dim array of primitive int
		System.out.println(clazz);

		clazz = Class.forName("[Ljava.lang.String;"); // one dim array of String
		System.out.println(clazz);

		clazz = Class.forName("[[Ljava.lang.Object;"); // two dim array of Object
		System.out.println(clazz);

		System.out.println("=============");
		// APPROACH 3: using class literals
		clazz = String.class;
		System.out.println(clazz);

		clazz = Serializable.class;
		System.out.println(clazz);

		clazz = byte.class;
		System.out.println(clazz);

		clazz = int.class;
		System.out.println(clazz);

		clazz = double.class;
		System.out.println(clazz);

		clazz = int[][].class;
		System.out.println(clazz);

		clazz = void.class;
		System.out.println(clazz);

	}

}
