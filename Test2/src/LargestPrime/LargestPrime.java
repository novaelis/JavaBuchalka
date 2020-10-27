package LargestPrime;

public class LargestPrime {
	public static void main(String[] args) {

		// System.out.println(isPrime(43));
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
		System.out.println(getLargestPrime(7));
		System.out.println(getLargestPrime(2));
		System.out.println(isPrime(19));

	}
	public static int getLargestPrime4(int number){
	     if(number<2)
	     {
	         return -1;
	     }else{
	         int i,copy=number;//to put the number into variabel copy.
	         for(i=2;i<copy;i++){//because prime numbers starts form 2.
	             if(copy%i==0){
	                 copy=copy/i;
	                 i--;
	             }
	             
	         }
	        
	    return i;    
	     }
	 }

	public static int getLargestPrime(int number) {
		boolean flag = false;

		if (number <= 1)
			return -1;
		
		if(number==2)
			return 2;
		
		for (int i = number; i > 2; i--) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
				if (j == i - 1)
					flag = true;

			}
			if (number % i == 0 && flag == true) {
				return i;
			}
		}
		return -1;
	}

	public static int getLargestPrime3(int number) {

		if (number <= 1)
			return -1;

		for (int i = number / 2; i > 2; i--) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue;
				}

			}
			if (number % i == 0)
				return i;
		}
		return -1;
	}

	public static int getLargestPrime2(int number) {

		if (number <= 1)
			return -1;
		for (int i = 2; i < number / 2 + 1; i++) {
			if (isPrime(number / i) && number % i == 0) {
				// System.out.println(i);
				return number / i;
			}

		}
		return -1;
	}

	public static boolean isPrime(int number) {

		for (int i = 2; i < number / 2 + 1; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
