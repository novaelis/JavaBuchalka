package SharedDigit;

public class SharedDigit {
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}
	
	public static boolean hasSharedDigit(int number, int number1) {
		
		int reserveNumber1 = number1;
		
		if(number<10 || number>99 || number1<10 || number1>99)
			return false;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if(number%10==reserveNumber1%10) {
					return true;
				}
				reserveNumber1 /= 10;
				
			}
			reserveNumber1 = number1;
			number /= 10;
		}
		
		return false;
	}
}
