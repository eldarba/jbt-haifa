package dp2.decorator.cofee.decorators;

import dp2.decorator.cofee.Beverage;

// Extends Beverage so as to be interchangeable with it
public abstract class CondimentDecorator extends Beverage {

	// by overriding as abstract we force implementors to override
	@Override
	public abstract String getDescription();
}
