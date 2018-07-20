package levelOneTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import levelOneMain.BasicTask;

public class BasicTaskTest {
	
	@Test
	public void returnHelloWorldTest() {
		BasicTask bt = new BasicTask();
		assertEquals("Output did not match 'Hello World!'",bt.returnHelloWorld(),"Hello World!");
	}

}
