package edu.sjsu.pratiksanglikar.state;

public class SuspendedState implements State {

	private VirtualMachine virtualMachine;
	
	public SuspendedState(VirtualMachine virtualMachine) {
		this.virtualMachine = virtualMachine;
	}

	@Override
	public void powerOn() {
		virtualMachine.setPowerOnState();
	}

	@Override
	public void powerOff() {
		virtualMachine.setPowerOffState();
	}

	@Override
	public void suspend() {
		// Do nothing
	}
}
