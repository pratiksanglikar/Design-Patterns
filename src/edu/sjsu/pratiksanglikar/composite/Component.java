package edu.sjsu.pratiksanglikar.composite;

public interface Component {
	public void addComponent(Component component);
	public void removeComponent(Component component);
	public Component getComponent(int i);
	public void printDescription();
}
