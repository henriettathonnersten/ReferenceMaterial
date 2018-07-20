package parametersAndConditionalsTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import parametersAndConditionalsMain.ParametersAndConditionalTask;

public class ParametersAndConditionalTaskTest {
	
	@Test
	public void addMethodTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("An addition error occurred",pact.sum(2,2),4);
	}
	
	@Test
	public void conditionalAddMethodTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("An addition error occurred",pact.sum(2,3,true),5);
	
	}
	
	@Test
	public void conditionalMultiplyMethodTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("A multiplication error occurred",pact.sum(2,3,false),6);
	}
	
	@Test
	public void sumWithZeroCheckingFirstNumberTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("Error returning the non-zero number",pact.sumWithZeroChecking(0,3,false),3);
	}
	@Test
	public void sumWithZeroCheckingSecondNumberTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("Error returning the non-zero number",pact.sumWithZeroChecking(3,0,false),3);
	}
	@Test
	public void sumWithZeroCheckingNormalBehaviourTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("Incorrect Normal behaviour",pact.sumWithZeroChecking(5,3,false),15);
	}
	
	@Test
	public void forLoopOverConditionalTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		
		for(int i = 0; i<10;i++) {
			assertEquals("Error in for loop conditional", pact.sum(10, i, false), i*10);
		}
	}
	

}
