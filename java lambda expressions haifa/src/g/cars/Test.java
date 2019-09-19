package g.cars;

public class Test {

	public static void main(String[] args) {

		Car c1 = x -> {
			System.out.println("went for " + x + " km");
			return x;
		};

		int total = 0;
		total += c1.drive(100);
		total += c1.drive(30);

		System.out.println("total travel: " + total);
	}

}
