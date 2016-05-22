package edu.sjsu.pratiksanglikar.chainofresponsibility;

public class Handler2 implements Handler {
	
	private Handler successor = null;

	@Override
	public void handleRequest(String request) {
		System.out.println("\nHandler 2: Received request : " + request);
		if(request.equalsIgnoreCase("R2")) {
			System.out.println("Request " + request + " handled by Handler 2");
		} else {
			if(successor != null) {
				System.out.println("Handler 2 can not handle request, forwarding the request " + request + " to successor");
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
