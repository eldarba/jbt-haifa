package dp1.strategy.ducks.fly;

public class FlyNot implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
