package parametersAndConditionalsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import parametersAndConditionalsMain.ParametersAndConditionalTask;
import parametersAndConditionalsMain.ParametersAndConditionalsMain;

public class ParametersAndConditionalTaskTest {

	@Test
	public void addMethodTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("An addition error occurred", pact.sum(2, 2), 4);
	}

	@Test
	public void conditionalAddMethodTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("An addition error occurred", pact.sum(2, 3, true), 5);

	}

	@Test
	public void conditionalMultiplyMethodTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("A multiplication error occurred", pact.sum(2, 3, false), 6);
	}

	@Test
	public void sumWithZeroCheckingFirstNumberTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("Error returning the non-zero number", pact.sumWithZeroChecking(0, 3, false), 3);
	}

	@Test
	public void sumWithZeroCheckingSecondNumberTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("Error returning the non-zero number", pact.sumWithZeroChecking(3, 0, false), 3);
	}

	@Test
	public void sumWithZeroCheckingNormalBehaviourTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		assertEquals("Incorrect Normal behaviour", pact.sumWithZeroChecking(5, 3, false), 15);
	}

	@Test
	public void testingTheMainForCodeCoverage() {
		ParametersAndConditionalsMain pacm = new ParametersAndConditionalsMain();
		pacm.main(null);
	}
	@Test
	public void creationOfArrayTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		int[] testArray = {1,2,3,4,5,6,7,8,9,10}; 
		assertTrue("Arrays do not match", Arrays.equals(testArray,pact.createNewArray()));
	}
	@Test
	public void modificationOfArrayTest() {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
		int[] testArray = {1,2,3,4,5,6,7,8,9,10}; 
		int[] expectedArray = {10,20,30,40,50,60,70,80,90,100}; 
		assertTrue("Arrays do not match", Arrays.equals(expectedArray,pact.modifyExistingArray(testArray)));
	}

}
