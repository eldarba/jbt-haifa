package dp1.strategy.ducks;

import dp1.strategy.ducks.fly.FlyNot;
import dp1.strategy.ducks.quack.Squeak;

public class PlaticDuck extends Duck {

	// in the CTOR we set the initial behavior of ducks
	public PlaticDuck() {
		this.flyBehavior = new FlyNot();
		this.quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mallard Duck");

	}

}
