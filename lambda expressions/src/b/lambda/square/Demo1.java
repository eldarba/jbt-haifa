package b.lambda.square;

public class Demo1 {

	public static void main(String[] args) {
		Square s1 = x -> x * x;
		System.out.println(s1.getArea(5));
	}

}
