package GreeterApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterAppTests {
	@Test
	void testGreet1() {
		Greeter testGreeting1 = new Greeter("Hello");
		assertEquals("Hello, Noah!", testGreeting1.greet("Noah"));
	}
	@Test
	void testGreet2() {
		Greeter testGreeting1 = new Greeter("Cheerio");
		assertEquals("Cheerio, Mark!", testGreeting1.greet("Mark"));
	}
	@Test
	void testGreet3() {
		Greeter testGreeting1 = new Greeter("Hola");
		assertEquals("Hola, Rose!", testGreeting1.greet("Rose"));
	}
	@Test
	void testGreet4() {
		Greeter testGreeting1 = new Greeter("Guten Tag");
		assertEquals("Guten Tag, Andrew!", testGreeting1.greet("Andrew"));
	}
	@Test
	void testGree5() {
		Greeter testGreeting1 = new Greeter("Howdy there");
		assertEquals("Howdy there, Sierra!", testGreeting1.greet("Sierra"));
	}
	@Test
	void testGreet6() {
		Greeter testGreeting1 = new Greeter("Buenos Dias");
		assertEquals("Buenos Dias, Jack!", testGreeting1.greet("Jack"));
	}
}
