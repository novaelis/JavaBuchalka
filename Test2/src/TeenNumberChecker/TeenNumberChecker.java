package TeenNumberChecker;

public class TeenNumberChecker {
	public static boolean hasTeen(int years,int years1,int years2){
        if((years>=13 && years<=19) || (years1>=13 && years1<=19) || (years2>=13 && years2<=19)){
            return true;
        }
        return false;
    }
}
