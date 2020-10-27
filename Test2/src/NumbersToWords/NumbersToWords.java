package NumbersToWords;

public class NumbersToWords {
	public static void main(String[] args) {
		/*
		 * System.out.println(getDigitCount(0)); System.out.println(getDigitCount(123));
		 * System.out.println(getDigitCount(-12));
		 * System.out.println(getDigitCount(5200));
		 * 
		 * System.out.println(reverse(1212)); System.out.println(reverse(-121));
		 * System.out.println(reverse(-1212));
		 */
		
		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		numberToWords(-12);
		
		System.out.println(getDigitCount(0));
	}

	public static void numberToWords(int number) {

		int to = getDigitCount(number);
		int reversedNumber = reverse(number);
		String numberString = "";

		if (number >= 0) {

			for (int i = 0; i < to; i++) {
				switch (reversedNumber % 10) {
				case 0:
					numberString += "Zero";
					break;
				case 1:
					numberString += "One";
					break;
				case 2:
					numberString += "Two";
					break;
				case 3:
					numberString += "Three";
					break;
				case 4:
					numberString += "Four";
					break;
				case 5:
					numberString += "Five";
					break;
				case 6:
					numberString += "Six";
					break;
				case 7:
					numberString += "Seven";
					break;
				case 8:
					numberString += "Eight";
					break;
				case 9:
					numberString += "Nine";
					break;
				}
				numberString += " ";
				reversedNumber /= 10;
			}
		}else
			System.out.println("Invalid Value");
		
		System.out.println(numberString);

	}

	public static int getDigitCount(int number) {
		int count = 0;
		
		if(number==0)
			return 1;
		
		if (number >= 0) {
			while (number > 0) {
				count++;
				number /= 10;
			}
		} else
			return -1;
		return count;
	}

	public static int reverse(int number) {
		int reverseNumber = 0;
		boolean negative = false;

		if (number < 0) {
			number *= -1;
			negative = true;
		}

		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
		}

		if (negative)
			reverseNumber *= -1;

		return reverseNumber;
	}
}
