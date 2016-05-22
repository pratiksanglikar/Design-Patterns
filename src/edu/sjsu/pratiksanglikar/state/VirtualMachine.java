package edu.sjsu.pratiksanglikar.state;

public class VirtualMachine {
	
	private State currentState;
	private State powerOnState;
	private State powerOffState;
	private State suspendedState;
	
	public VirtualMachine() {
		powerOnState = new PowerOnState(this);
		powerOffState = new PowerOffState(this);
		suspendedState = new SuspendedState(this);
		currentState = powerOffState; 
	}
	
	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public void setPowerOnState() {
		System.out.println("Powered On!");
		this.currentState = powerOnState;
	}
	
	public void setPowerOffState() {
		System.out.println("Powered Off!");
		this.currentState = powerOffState;
	}
	
	public void setSuspendedState() {
		System.out.println("Suspended!");
		this.currentState = suspendedState;
	}
	
	public void powerOn() {
		currentState.powerOn();
	}
	
	public void powerOff() {
		currentState.powerOff();
	}
	
	public void suspend() {
		currentState.suspend();
	}
}