package GreatestCommonDivisor;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(15, 25));
		System.out.println(getGreatestCommonDivisor(12, 30));
		System.out.println(getGreatestCommonDivisor(9, 18));
		System.out.println(getGreatestCommonDivisor(81, 153));
	}
	public static int getGreatestCommonDivisor(int number, int number1) {
		int from = 0;
		if(number<10 || number1<10)
			return -1;
		if(number<number1) {
			from = number;
		}else
			from = number1;
		
		for (int i = from; i > 1; i--) {
			if(number%i==0 && number1%i==0) {
				return i;
			}
			
		}
		
		return -1;
		
		
	}
}
