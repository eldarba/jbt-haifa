package dp1.strategy.ducks.fly;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with a rocket");
	}

}
