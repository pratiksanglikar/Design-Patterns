package edu.sjsu.pratiksanglikar.factory;

public abstract class Enemy {
	private String name;
	private double damage;
	private double speed;
	
	public void followPlayer() {
		System.out.println(getName() + " is now following a player");
	}
	
	public void attack() {
		System.out.println(getName() + " is now attacking the player with damage " + getDamage());
	}
	
	public void move() {
		System.out.println(getName() + " is now moving with speed " + getSpeed());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDamage() {
		return damage;
	}
	
	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
}
