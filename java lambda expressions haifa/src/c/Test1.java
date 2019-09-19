package c;

public class Test1 {

	public static void main(String[] args) {

		Car car = new Car() {
			// anonymous inner class
			// fields
			private int km;

			// methods
			@Override
			public int drive(int distance) {
				km += distance;
				return km;
			}

		};

		car.drive(50);
		car.drive(20);
		int km = car.drive(40);
		System.out.println("total travel: " + km);

	}
}
