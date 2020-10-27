package InputCalculator;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {

		int number = 0;
		int sum = 0;
		double avg = 0;
		int counter = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter a number: ");
			boolean isNumber = sc.hasNextInt();

			if (isNumber) {

				number = sc.nextInt();
				sum += number;
				counter++;

			} else {
				break;
			}

		}
		if (counter != 0) {
			avg = (double) sum / counter;
			System.out.println(avg);
		}
		System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));

	}
}
