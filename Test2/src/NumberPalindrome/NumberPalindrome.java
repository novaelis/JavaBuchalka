package NumberPalindrome;

public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
	}
	
	public static boolean isPalindrome(int number){
        int inverseNumber = 0;
        int temp = number;
        
        if(number<0) {
        	temp *= -1;
        }
        
        while(temp>0) {
        	inverseNumber = inverseNumber*10+temp%10;
        	temp /= 10;
        	System.out.println(inverseNumber);
        }
        
        if(number<0) {
        	number *= -1;
        }
        
        if(inverseNumber==number)
        	return true;
        return false;
    }
}
