package DayOfTheWeekChallange;

public class DayOfTheWeekChallange {

	public static void main(String[] args) {
		printDayOfTheWeek(2);
		printDayOfTheWeek2(2);
	}

	public static void printDayOfTheWeek(int day) {

		switch (day) {
		case 0:
			System.out.println("Monday");
			break;
		case 1:
			System.out.println("Thusday");
			break;
		case 2:
			System.out.println("Wendsday");
			break;
		case 3:
			System.out.println("Thrusday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		case 5:
			System.out.println("Saturday");
			break;
		case 6:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}
	}

	public static void printDayOfTheWeek2(int day) {

		if (day == 0) {
			System.out.println("Monday");
		} else if (day == 1) {
			System.out.println("Thusday");
		} else if (day == 2) {
			System.out.println("Wendsday");
		} else if (day == 3) {
			System.out.println("Thrusday");
		} else if (day == 4) {
			System.out.println("Friday");
		} else if (day == 5) {
			System.out.println("Satuday");
		} else if (day == 6) {
			System.out.println("Sunday");
		} else
			System.out.println("Invalid day");
	}
}
