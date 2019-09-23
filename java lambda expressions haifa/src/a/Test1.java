package a;

public class Test1 {

	public static void main(String[] args) {
		Square square = new SquareImpl();
		int area = square.getArea(5);
		System.out.println(area);
	}
}
