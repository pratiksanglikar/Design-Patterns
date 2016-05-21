package edu.sjsu.pratiksanglikar.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin Crust Pizza";
	}

	@Override
	public double getPrice() {
		return 9.99;
	}
}
