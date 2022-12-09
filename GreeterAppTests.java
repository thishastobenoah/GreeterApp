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
	void testGreet5() {
		Greeter testGreeting1 = new Greeter("Howdy there");
		assertEquals("Howdy there, Sierra!", testGreeting1.greet("Sierra"));
	}
	@Test
	void testGreet6() {
		Greeter testGreeting1 = new Greeter("Buenos Dias");
		assertEquals("Buenos Dias, Jack!", testGreeting1.greet("Jack"));
	}
	@Test
	void testSimonGreet1() {
		SimonGreeter testSimonGreeting1 = new SimonGreeter("Buenos Dias");
		assertEquals("Simon says \"Buenos Dias, Jack!\"", testSimonGreeting1.greet("Jack"));
	}
	@Test
	void testSimonGreet2() {
		SimonGreeter testSimonGreeting1 = new SimonGreeter("Hola");
		assertEquals("Simon says \"Hola, Rose!\"", testSimonGreeting1.greet("Rose"));
	}
	@Test
	void testLoudGreet1() {
		LoudGreeter testSimonGreeting1 = new LoudGreeter("Buenos Dias");
		assertEquals("Buenos Dias, Jack!!", testSimonGreeting1.greet("Jack"));
	}
	@Test
	void testLoudGreet2() {
		LoudGreeter testSimonGreeting1 = new LoudGreeter("Buenos Dias");
		testSimonGreeting1.addVolume();
		assertEquals("Buenos Dias, Jack!!!", testSimonGreeting1.greet("Jack"));
	}
	@Test
	void testLoudGreet3() {
		LoudGreeter testSimonGreeting1 = new LoudGreeter("Hello");
		testSimonGreeting1.addVolume();
		testSimonGreeting1.addVolume();
		testSimonGreeting1.addVolume();
		assertEquals("Hello, Noah!!!!!", testSimonGreeting1.greet("Noah"));
	}
	@Test
	void testHtmlGreet1() {
		HtmlGreeter testHtmlGreeting1 = new HtmlGreeter("Hello", "f");
		assertEquals("<f>Hello, Noah!</f>", testHtmlGreeting1.greet("Noah"));
	}
	//default tagName test
	@Test
	void testHtmlGreet2() {
		HtmlGreeter testHtmlGreeting1 = new HtmlGreeter("Hello");
		assertEquals("<h1>Hello, Noah!</h1>", testHtmlGreeting1.greet("Noah"));
	}
	@Test
	void testHtmlGreet3() {
		HtmlGreeter testHtmlGreeting1 = new HtmlGreeter("Bonjour", "JAVA");
		assertEquals("<JAVA>Bonjour, Terrance!</JAVA>", testHtmlGreeting1.greet("Terrance"));
	}
	@Test
	void testHtmlGreet4() {
		HtmlGreeter testHtmlGreeting1 = new HtmlGreeter("Hola", "88");
		assertEquals("<88>Hola, Rose!</88>", testHtmlGreeting1.greet("Rose"));
	}
}
