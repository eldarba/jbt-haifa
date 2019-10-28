package dp1.strategy.ducks.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("not supported (quack)");
	}

}
