package a;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		String name = "aaa";

		Optional<String> str = Optional.of("aaa");
		Optional<String> str2 = Optional.empty();

		System.out.println(str);
		System.out.println(str2);

	}

}
