package edu.sjsu.pratiksanglikar.state;

public class PowerOnState implements State {
	
	private VirtualMachine virtualMachine;

	public PowerOnState(VirtualMachine virtualMachine) {
		this.virtualMachine = virtualMachine;
	}

	@Override
	public void powerOn() {
		// Do nothing
	}

	@Override
	public void powerOff() {
		virtualMachine.setPowerOffState();
	}

	@Override
	public void suspend() {
		virtualMachine.setSuspendedState();
	}
}
