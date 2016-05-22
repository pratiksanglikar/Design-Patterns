package edu.sjsu.pratiksanglikar.proxy;

public interface Proxy {
	public String getData(String authToken);
	public void setData(String authToken, String data);
}
