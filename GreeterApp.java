package GreeterApp;

import java.util.Scanner;

public class GreeterApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Choose a greeting: ");
		String userGreeting = scnr.nextLine();
		Greeter greeting1 = new Greeter(userGreeting);
		System.out.print("Enter your name: ");
		String userName = scnr.nextLine();
		System.out.println(greeting1.greet(userName));
		scnr.close();
	}
}
