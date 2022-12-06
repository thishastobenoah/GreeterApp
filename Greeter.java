package GreeterApp;

public class Greeter {
	private String greeting;
	
	//constructor
	public Greeter (String greeting) {
		this.greeting = greeting;
	}
	//getter and setter
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	//greet method
	public String greet (String name) {
		return (greeting + ", " + name + "!");
	}
}
