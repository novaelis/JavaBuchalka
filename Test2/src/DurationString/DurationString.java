package DurationString;

public class DurationString {
	
	public static void main(String[] args) {
		System.out.println(getDurationString(860, 45));
		System.out.println(getDurationString(53, 45));
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(65, 5));
		System.out.println(getDurationString(0, 0));
		System.out.println(getDurationString(-1, 63));
		System.out.println(getDurationString(51645));
		
	}
	
	
	private static String getDurationString(int minutes, int seconds) {
		int hours = 0;
		int remainingMinutes = 0;
		if(minutes>= 0 && seconds>=0 && seconds<=59) {
			hours = minutes / 60;
			remainingMinutes = minutes % 60;
			
			String poruka = "";
			
			if(hours<10) {
				poruka = poruka+"0 "+hours+"h";
			}
			/*
			 * if(hours<10 && remainingMinutes<10 && seconds<10) { return
			 * "0"+hours+"h 0"+remainingMinutes+"m 0"+seconds+"s"; }else if(hours<10 &&
			 * remainingMinutes<10) { return
			 * "0"+hours+"h 0"+remainingMinutes+"m "+seconds+"s"; }else if(hours<10 &&
			 * seconds<10) { return "0"+hours+"h "+remainingMinutes+"m "+seconds+"s"; }else
			 * if(remainingMinutes<=10 && seconds<10) { return
			 * hours+"h 0"+remainingMinutes+"m "+seconds+"s"; }else if(hours<10) { return
			 * "0"+hours+"h "+remainingMinutes+"m "+seconds+"s"; }else
			 * if(remainingMinutes<0) { return
			 * hours+"h 0"+remainingMinutes+"m "+seconds+"s"; }else if(seconds<10) return
			 * hours+"h "+remainingMinutes+"m 0"+seconds+"s";
			 */
		}
		return "Invalid value";
	}
	
	private static String getDurationString(int seconds) {
		int minutes = 0;
		int remainingSeconds = 0;
		if(seconds>=0) {
			minutes = seconds/60;
			remainingSeconds = seconds%60;
			return getDurationString(minutes, remainingSeconds);
		}
		return "Invalid value";
	}
}
