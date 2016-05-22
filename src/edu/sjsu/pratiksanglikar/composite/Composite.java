package edu.sjsu.pratiksanglikar.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private String description;
	private List<Component> components;
	
	public Composite(String description) {
		this.description = description;
		components = new ArrayList<Component>(0);
	}
	
	@Override
	public void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void removeComponent(Component component) {
		components.remove(component);
	}

	@Override
	public Component getComponent(int i) {
		return components.get(i);
	}

	@Override
	public void printDescription() {
		System.out.println("\n" + description);
		for (Component component : components) {
			component.printDescription();
		}
	}
}
