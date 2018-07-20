package levelOneTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import levelOneMain.BasicTask;

public class BasicTaskTest {
	
	private BasicTask bt = new BasicTask();

	@Test
	public void changingVariableTest() {
		bt.setexampleVariable("This is Dale");
		assertEquals("String values do not match!",bt.getexampleVariable(),"This is Dale");
	}
	
	@Test
	public void returnHelloWorldTest() {
		assertEquals("Output did not match 'Hello World!'",bt.returnHelloWorld(),"Hello World!");
	}
	@Test
	public void helloWorldVariableTest() {
		bt.setexampleVariable("Goodbye Moon");
		assertEquals("Variable containing 'Goodbye Moon' has not been returned.", bt.getexampleVariable(), "Goodbye Moon");
	}


}
