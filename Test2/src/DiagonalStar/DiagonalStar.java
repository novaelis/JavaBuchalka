package DiagonalStar;

public class DiagonalStar {
	
	public static void main(String[] args) {
		printSquareStar(8);
	}
	public static void printSquareStar(int number) {
		if (number >= 5) {
			for (int i = 0; i < number; i++) {
				
				for (int j 	= 0; j < number; j++) {
					if(i==0 || i==number-1) {
						System.out.print("*");
					}else if(j==0 || j==number-1 || j==i || j+i==number-1){
						System.out.print("*");
					}else
						System.out.print(" ");
					
				}
				System.out.print("\n");
				
			}
		}else
			System.out.println("Invalid Value");
	}
}
