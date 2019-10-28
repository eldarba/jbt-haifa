package dp2.decorator.cofee.decorators;

import dp2.decorator.cofee.Beverage;

// decorators (condiment) wrap base object (beverage)
public class Milk extends CondimentDecorator {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.description = "Milk";
		this.beverage = beverage;

	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " + " + this.description;
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.45;
	}

}
