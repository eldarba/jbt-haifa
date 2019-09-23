package h.lines;

public class Test {

	public static void main(String[] args) {

		// local variable - to use it from lambda must be final or effectively final
		int length = 3;

		Line line = () -> {
			for (int i = 0; i < length; i++) {
				System.out.print(" * ");
			}
			System.out.println();
		};

		line.draw();

		SmartLine sl = x -> {
			String str = "";
			for (int i = 0; i < x; i++) {
				str += " * ";
			}
			return str;
		};

		System.out.println(sl.draw(5));
		System.out.println(sl.draw(15));
		System.out.println(sl.draw(2));

	}

}
