package c.generics;

import java.util.List;

public class AppDemo {
	// in the user class we send a type argument
	public static void main(String[] args) {
		// <String> is a type argument
		Box<String> b1 = new Box<>("aaa");
		Box<Integer> b2 = new Box<>(5);

		String x = b1.getContent();
		int y = b2.getContent();

		List<Integer> ls;
	}
}
