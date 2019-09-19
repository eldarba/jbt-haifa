package i.calculator;

public class Test {

	public static void main(String[] args) {

		SumCalculator calc = (x, y) -> x + y;

		System.out.println(calc.sum(6, 3));
		System.out.println(calc.sum(100, 200));
		System.out.println(calc.sum(50, 30));

	}

}
