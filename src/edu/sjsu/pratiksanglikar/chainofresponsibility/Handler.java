package edu.sjsu.pratiksanglikar.chainofresponsibility;

public interface Handler {
	public void handleRequest(String request);
	public void setSuccessor(Handler handler);
}
