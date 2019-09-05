package a;

import java.util.Optional;

public class Demo1 {

	public static void main(String[] args) {

<<<<<<< HEAD
		String name = "aaa";

		Optional<String> str = Optional.of("aaa");
		Optional<String> str2 = Optional.empty();

		System.out.println(str);
		System.out.println(str2);

=======
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
>>>>>>> branch 'master' of https://github.com/eldarba/jbt-haifa
	}

}
