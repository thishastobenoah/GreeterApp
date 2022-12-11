package GreeterApp;

import java.util.Scanner;

public class GreeterApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);
		System.out.print("Choose a greeting: ");
		String userGreeting = scnr.nextLine();
		Greeter greeting1 = new Greeter(userGreeting);
		System.out.print("Enter your name: ");
		String userName = scnr.nextLine();
		System.out.println(greeting1.greet(userName));
		SimonGreeter simon1 = new SimonGreeter(userGreeting);
		System.out.println(simon1.greet(userName));
		LoudGreeter loud1 = new LoudGreeter(userGreeting);
		System.out.print("How much volume would you like to add?:");
		int volume = scnr2.nextInt();
		for (int i = 0; i <volume; i++) {
			loud1.addVolume();
		}
		System.out.println(loud1.greet(userName));
		System.out.print("Enter tagName:");
		String tagName = scnr.nextLine();
		HtmlGreeter html1 = new HtmlGreeter(userGreeting, tagName);
		System.out.println(html1.greet(userName));
		scnr.close();
		scnr2.close();
	}
}
