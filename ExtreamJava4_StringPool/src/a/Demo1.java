package a;

public class Demo1 {

	public static void main(String[] args) {

		// create a string via string literal
		// stored in string pool which is an object on the heap
		// literals with same content share storage
		String s = "hello!";

		// create a string via new
		// stored like regular objects
		// no storage sharing
		String s2 = new String("hello!");
	}
}
