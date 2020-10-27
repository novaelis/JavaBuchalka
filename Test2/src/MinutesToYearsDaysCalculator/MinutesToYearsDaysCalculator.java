package MinutesToYearsDaysCalculator;

public class MinutesToYearsDaysCalculator {
	
	
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}
	public static void printYearsAndDays(long minutes) {
		long years = 0;
		long days = 0;
		long remainingMinutes = 0;
		
		
		if(minutes<0) {
			System.out.println("Invalid Value");
		}else {
			years = minutes/525600;
			remainingMinutes = minutes%525600;
			days = remainingMinutes/1440;
			System.out.println(minutes+" min = "+years+" y and "+days+" d");
			
		}
	}

}
