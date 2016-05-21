package edu.sjsu.pratiksanglikar.strategy;

public class CantFly implements FlyingStrategy {

	@Override
	public void tryToFly() {
		System.out.println("Can't fly!");
	}
}
