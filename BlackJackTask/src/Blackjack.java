
public class Blackjack {

	public int getDifference(int origin, int differenceFrom) {
		return differenceFrom-origin;
	}
	
	public int play(int firstNum, int secondNum) {
		int firstNumDifference = getDifference(firstNum,21);
		int secondNumDifference = getDifference(secondNum,21);
		if(firstNumDifference<0&&secondNumDifference<0) {
			return 0;
			}
		else if(firstNumDifference<0) {
			return secondNum;
		}else if(secondNumDifference<0) {
			return firstNum;
		}
			else return(firstNumDifference >secondNumDifference)?secondNum:firstNum;
		
		
	}

}
