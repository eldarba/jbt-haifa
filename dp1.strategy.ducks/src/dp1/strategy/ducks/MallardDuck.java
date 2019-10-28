package dp1.strategy.ducks;

import dp1.strategy.ducks.fly.FlyWithWings;
import dp1.strategy.ducks.quack.Quack;

public class MallardDuck extends Duck {

	// in the CTOR we set the initial behavior of ducks
	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a real Mallard Duck");

	}

}
