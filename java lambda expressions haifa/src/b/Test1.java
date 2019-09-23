package b;

public class Test1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();

		Animal a2 = new Animal() {

			@Override
			public void speak() {
				System.out.println("Special Animal Speak");
			}

		};

		a1.speak();
		a2.speak();
	}

}
