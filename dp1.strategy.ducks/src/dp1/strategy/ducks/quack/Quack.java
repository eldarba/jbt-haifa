package dp1.strategy.ducks.quack;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack (real living duck)");
	}

}
