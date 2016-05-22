package edu.sjsu.pratiksanglikar.composite;

public class Leaf implements Component {

	private String description;
	private double price;
	
	public Leaf(String description, double price) {
		this.description = description;
		this.price = price;
	}
	
	@Override
	public void addComponent(Component component) {
		//No implementation
	}

	@Override
	public void removeComponent(Component component) {
		//No implementation
	}

	@Override
	public Component getComponent(int i) {
		//No implementation
		return null;
	}

	@Override
	public void printDescription() {
		System.out.println(description + "\t\t\t$" + price);
	}
}
