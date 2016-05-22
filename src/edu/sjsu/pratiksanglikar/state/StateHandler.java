package edu.sjsu.pratiksanglikar.state;

public class StateHandler {

	public static void main(String[] args) {
		VirtualMachine vm = new VirtualMachine();
		vm.powerOn();
		vm.suspend();
		vm.powerOff();
		vm.suspend();
		vm.powerOn();
		vm.powerOn();
		vm.suspend();
		vm.suspend();
	}
}