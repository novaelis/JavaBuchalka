package FirstAndLastDigitSum;

public class FirstAndLastDigitSum {
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(10));
	}
	public static int sumFirstAndLastDigit(int number) {
		int lastDigit = number%10	;
		
		if(number<0)
			return -1;
		
		while(number>=10) {
			number /= 10;
		}
		
		int firstDigit = number;
		
		return firstDigit+lastDigit;
	}
}
