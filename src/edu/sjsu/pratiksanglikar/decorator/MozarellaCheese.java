package edu.sjsu.pratiksanglikar.decorator;

public class MozarellaCheese extends ToppingDecorator {

	public MozarellaCheese(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return super.getDescription() + ", Mozrella";
	}
	
	public double getPrice() {
		return super.getPrice() + 2.20;
	}
}
