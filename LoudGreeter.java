package GreeterApp;

public class LoudGreeter extends Greeter {
	String extra = "!";
	public LoudGreeter(String greeting) {
		super(greeting);
	}
	public void addVolume () {
		extra += "!";
	}
	
	@Override
	public String greet (String name) {
		return super.greet(name) + extra;
	}
}
