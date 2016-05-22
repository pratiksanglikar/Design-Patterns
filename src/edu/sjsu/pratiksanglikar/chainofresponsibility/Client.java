package edu.sjsu.pratiksanglikar.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Handler handler1 = new Handler1();
		Handler handler2 = new Handler2();
		Handler handler3 = new Handler3();
		
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		handler1.handleRequest("R1");
		handler1.handleRequest("R2");
		handler1.handleRequest("R3");
		handler1.handleRequest("R4");
	}
}
