package DecimalComparator;

public class DecimalComparator {
	
	public static void main(String[] args) {
		System.out.println(areEqualThreeDecimalPlaecs(-3.1756, 3.1755));
		System.out.println(areEqualThreeDecimalPlaecs(3.175, 3.176));
		System.out.println(areEqualThreeDecimalPlaecs(-3.0, 3.0));
		System.out.println(areEqualThreeDecimalPlaecs(-3.123, 3.123));
		System.out.println(areEqualThreeDecimalPlaecs(-3.1756, 3.1757));
	}
	
	public static boolean areEqualThreeDecimalPlaecs(double number1, double number2) {
		int broj = (int) (number1 * 1000);
		int broj2 = (int) (number2 * 1000);
		
		System.out.println("broj je: "+broj+" broj2 je: "+broj2);
		
		if (broj==broj2) {
			return true;
		}
		return false;
	}
}
