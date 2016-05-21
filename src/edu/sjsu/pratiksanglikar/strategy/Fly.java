package edu.sjsu.pratiksanglikar.strategy;

public class Fly implements FlyingStrategy {
	@Override
	public void tryToFly() {
		System.out.println("Flying high!");
	}
}
