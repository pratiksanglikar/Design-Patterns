package edu.sjsu.pratiksanglikar.state;

public class PowerOffState implements State {

	private VirtualMachine virtualMachine;
	
	public PowerOffState(VirtualMachine virtualMachine) {
		this.virtualMachine = virtualMachine;
	}

	@Override
	public void powerOn() {
		virtualMachine.setPowerOnState();
	}

	@Override
	public void powerOff() {
		// Do nothing
	}

	@Override
	public void suspend() {
		// Do nothing
	}
}
