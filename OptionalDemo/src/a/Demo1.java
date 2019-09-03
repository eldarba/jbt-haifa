package a;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

		Optional<Integer> x = Optional.of(5);
		Optional<String> name = Optional.of("Eldar");
		Optional<Integer> y = Optional.empty();
		Optional<Integer> z1 = Optional.ofNullable(null);
		Optional<Integer> z2 = Optional.ofNullable(55);

		System.out.println(x);
		System.out.println(y);
		System.out.println(name);
		System.out.println(z1);
		System.out.println(z2);
	}

}
