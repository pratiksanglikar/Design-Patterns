package edu.sjsu.pratiksanglikar.strategy;

public class Bird extends Animal {
	public Bird() {
		super.setFlyingStrategy(new Fly());
	}
	
	public void chirp() {
		System.out.println("Chirping!");
	}
}
