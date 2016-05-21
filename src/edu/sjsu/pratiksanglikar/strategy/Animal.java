package edu.sjsu.pratiksanglikar.strategy;

public class Animal {
	private String name;
	private String sound;
	private FlyingStrategy flyingStrategy;
	
	public Animal() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public FlyingStrategy getFlyingStrategy() {
		return flyingStrategy;
	}

	public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}
	
	public void fly() {
		this.flyingStrategy.tryToFly();
	}
}
