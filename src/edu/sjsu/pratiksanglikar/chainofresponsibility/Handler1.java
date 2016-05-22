package edu.sjsu.pratiksanglikar.chainofresponsibility;

public class Handler1 implements Handler {

	private Handler successor = null;
	
	@Override
	public void handleRequest(String request) {
		System.out.println("\nHandler 1: Received request : " + request);
		if(request.equalsIgnoreCase("R1")) {
			System.out.println("Request " + request + " handled by Handler 1");
		} else {
			if(successor != null) {
				System.out.println("Handler 1 can not handle request, forwarding the request " + request + " to successor");
				successor.handleRequest(request);
			} else {
				System.out.println("Request " + request + " can not be handled!");
			}
		}
	}
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
