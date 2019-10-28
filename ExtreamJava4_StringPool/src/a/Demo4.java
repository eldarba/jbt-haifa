package a;

public class Demo4 {

	public static void main(String[] args) {

		/*
		 * concatenation result interned since this is a literal with value known at
		 * compile time
		 */
		String s = "hel" + "lo";

		/* this string literal is interned - value known at runtime. */
		String s1 = "lo";

		/*
		 * not interned - a concatenation of literal and variable - s1 evaluated at
		 * runtime. The resulting string object will be created outside of the string
		 * pool.
		 */
		String s2 = "hel" + s1;
		/**
		 * note that had s1 been final (hence it's value known at runtime) s2 would have
		 * been interned
		 */

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		// explicit interning
		s2 = s2.intern();

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

	}

}
