package dp2.decorator.cofee.app;

import dp2.decorator.cofee.Beverage;
import dp2.decorator.cofee.Espresso;
import dp2.decorator.cofee.HouseBlend;
import dp2.decorator.cofee.Tea;
import dp2.decorator.cofee.decorators.Milk;
import dp2.decorator.cofee.decorators.Mocha;
import dp2.decorator.cofee.decorators.Soya;

public class App {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " cost: " + espresso.cost());
		Beverage espressoSoy = new Soya(new Espresso());
		System.out.println(espressoSoy.getDescription() + " cost: " + espressoSoy.cost());

		Beverage b1 = new Milk(new Soya(new Mocha(new Tea())));
		System.out.println(b1.getDescription() + " cost: " + b1.cost());

		Beverage b2 = new Milk(new Milk(new HouseBlend()));
		System.out.println(b2.getDescription() + " cost: " + b2.cost());
		Beverage b3 = new Milk(new HouseBlend());
		System.out.println(b3.getDescription() + " cost: " + b3.cost());

	}
}
