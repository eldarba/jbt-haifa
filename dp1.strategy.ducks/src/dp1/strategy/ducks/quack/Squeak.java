package dp1.strategy.ducks.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak (toy duck)");
	}

}
