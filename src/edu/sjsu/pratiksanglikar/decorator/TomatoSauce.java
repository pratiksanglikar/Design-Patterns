package edu.sjsu.pratiksanglikar.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return super.getDescription() + ", Tomato Sauce";
	}
	
	public double getPrice() {
		return super.getPrice() + 0.5;
	}
}
