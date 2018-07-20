package parametersAndConditionalsMain;

public class ParametersAndConditionalTask {
	
	public int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	public int sum(int firstNumber, int secondNumber, boolean addOrMultiply) {
		return addOrMultiply?(firstNumber+secondNumber):(firstNumber*secondNumber);
	}
	
	public int sumWithZeroChecking(int firstNumber, int secondNumber, boolean addOrMultiply) {
		if(firstNumber==0) {return secondNumber;}
		else if (secondNumber ==0) {return firstNumber;}
		else return sum(firstNumber,secondNumber,addOrMultiply);
		
	}
	
	

}
