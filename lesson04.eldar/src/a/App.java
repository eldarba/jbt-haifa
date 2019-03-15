package a;

import calculator.Calculator;

public class App {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.getRes());
		c.add(5);
		System.out.println(c.getRes());
	}

}
