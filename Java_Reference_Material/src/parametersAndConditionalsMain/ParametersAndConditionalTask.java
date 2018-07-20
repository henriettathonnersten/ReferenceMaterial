package parametersAndConditionalsMain;

public class ParametersAndConditionalTask {

	public int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public int sum(int firstNumber, int secondNumber, boolean addOrMultiply) {
		return addOrMultiply ? (firstNumber + secondNumber) : (firstNumber * secondNumber);
	}

	public int sumWithZeroChecking(int firstNumber, int secondNumber, boolean addOrMultiply) {
		if (firstNumber == 0) {
			return secondNumber;
		} else if (secondNumber == 0) {
			return firstNumber;
		} else
			return sum(firstNumber, secondNumber, addOrMultiply);

	}
	public int[] createNewArray() {
		int[] arrayOfInts = new int[10];
		for (int i = 1; i <= 10; i++) {
			arrayOfInts[i - 1] = i;
		}
		return arrayOfInts;
	}
	
	public int[] modifyExistingArray(int[] arrayOfInts) {
		int[] newArrayOfInts= new int[arrayOfInts.length];
		for (int i = 0; i < arrayOfInts.length; i++) {
			newArrayOfInts[i] = arrayOfInts[i]*10;
		}
		return newArrayOfInts;
	}

}
