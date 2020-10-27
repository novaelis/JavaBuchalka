package test;

public class SpeedConverter {

	public static void main(String[] args) {
		
		  System.out.println(toMilesPerHour(1.5));
		  System.out.println(toMilesPerHour(10.25));
		  System.out.println(toMilesPerHour(-5.6));
		  System.out.println(toMilesPerHour(25.42));
		  System.out.println(toMilesPerHour(75.114));
		  
		  
		  printConversation(1.5);
		  printConversation(10.25);
		  printConversation(-5.6);
		  printConversation(25.42);
		  printConversation(75.114);
		  printConversation(-2);
		  printConversation(95.75);
		 
		/*
		 * double number = 1.5; long rounded = Math.round(number);
		 * System.out.println("rounded= " + rounded); System.out.println("with 3.9= " +
		 * Math.round(3.9)); System.out.println("with 4.5= " + Math.round(4.5)); int sum
		 * = 45; int count = 10; // typecasting so result is double e.g. double / int ->
		 * double double average = (double) sum / count; long roundedAverage =
		 * Math.round(average); System.out.println("average= " + average);
		 * System.out.println("roundedAverage= " + roundedAverage);
		 */

	}

	public static long toMilesPerHour(double kilometersPerHour) {
		long milesPerHour = 0;
		if (kilometersPerHour < 0) {
			milesPerHour = -1;
		} else {
			milesPerHour = (long) Math.round(kilometersPerHour / 1.609);
		}
		return milesPerHour;
	}
	
	public static void printConversation(double kilometersPerHour) {
		long milesPerHour = 0;
		if (kilometersPerHour < 0) {
			System.out.println("Invalid type");
		} else {
			milesPerHour = (long) Math.round(kilometersPerHour / 1.609);
			System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
		}
		
	}

}
