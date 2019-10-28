package dp1.strategy.ducks;

import dp1.strategy.ducks.fly.FlyBehavior;
import dp1.strategy.ducks.quack.QuackBehavior;

public abstract class Duck {

	// the changeable behaviors are encapsulated in external objects
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	// by setting behaviors we change them on runtime
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	//

	// changeable behaviors
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	// set behaviors
	public void swim() {
		System.out.println("swim like a duck - all ducks can swim even plastic ducks");
	}

	// some functions are not implemented yet
	public abstract void display();

}
