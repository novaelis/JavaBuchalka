package PlayingCat;

public class PlayingCat {
	
	public static void main(String[] args) {
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
		
		char karakter = 'G';
		
		switch (karakter) {
		case 'A':
			System.out.println("A je pronadjen");
			break;
		case 'B':
			System.out.println("B je pronadjen");
			break;
		case 'C' :case 'D': case 'E':
			System.out.println(karakter+" je pronadjen");

		default:
			System.out.println("Not foudn");
		}
	}
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(summer == true && (temperature>=25 && temperature<=45)) {
			return true;
		}else if(summer == false && (temperature>=25 && temperature<=35)) {
			return true;
		}
		return false;
	}
}
