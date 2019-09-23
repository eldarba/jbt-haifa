package a;

public class Test2 {

	public static void main(String[] args) {

		Square square = new Square() { // anonymous inner class
			int x = 5;

			@Override
			public int getArea(int x) {
				return x * x;
			}

		};

		int area = square.getArea(5);
		System.out.println(area);
	}
}
