package parametersAndConditionalsMain;

public class ParametersAndConditionalsMain {

	public static void main(String[] args) {
		ParametersAndConditionalTask pact = new ParametersAndConditionalTask();

		int[] arrayOfInts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i : arrayOfInts) {
			System.out.println(pact.sumWithZeroChecking(10, i, true));
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(pact.sumWithZeroChecking(10, i, false));
		}

		
		//iteration/arrays 2 done simply in the main. 
		//See ParametersAndConditionalTask for a method-based implementation
		int[] secondArrayOfInts = new int[10];
		for (int i = 1; i <= 10; i++) {
			secondArrayOfInts[i - 1] = i;
			System.out.println(secondArrayOfInts[i - 1]);
		}
		for (int i = 1; i <= 10; i++) {
			secondArrayOfInts[i - 1] = i * 10;
			System.out.println(secondArrayOfInts[i - 1]);
		}

	}
}
