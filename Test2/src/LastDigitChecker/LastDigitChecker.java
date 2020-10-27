package LastDigitChecker;

public class LastDigitChecker {
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(9, 99, 19));
	}
	
	public static boolean hasSameLastDigit(int number, int number1, int number2) {
		if(isValid(number) && isValid(number1) && isValid(number2) )
			if(number%10==number1%10 || number1%10==number2%10 || number%10==number2%10) {
				return true;
			}
		
		return false;
	}
	public static boolean isValid(int number) {
		if(number>=10 && number<=1000)
			return true;
		return false;
	}
}
