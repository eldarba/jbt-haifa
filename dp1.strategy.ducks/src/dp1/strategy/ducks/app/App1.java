package dp1.strategy.ducks.app;

import dp1.strategy.ducks.Duck;
import dp1.strategy.ducks.MallardDuck;
import dp1.strategy.ducks.fly.FlyFast;
import dp1.strategy.ducks.fly.FlyNot;

public class App1 {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		// turn this duck behavior to not fly
		mallard.setFlyBehavior(new FlyNot());
		mallard.performFly();
		mallard.setFlyBehavior(new FlyFast());
		mallard.performFly();
	}

}
