package parametersAndConditionalsMain;

import static org.junit.Assert.assertEquals;

public class ParametersAndConditionalsMain {

	public static void main(String[] args) {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();
	
		int[] arrayOfInts = {1,2,3,4,5,6,7,8,9,10};
		for(int i : arrayOfInts) {
			System.out.println(pact.sumWithZeroChecking(10, i, true));
		}
			for(int i = 0; i<10;i++) {
			System.out.println(pact.sumWithZeroChecking(10, i, false));
			}

	}
	}


