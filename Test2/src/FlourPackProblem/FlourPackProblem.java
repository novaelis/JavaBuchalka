package FlourPackProblem;

public class FlourPackProblem {

	public static void main(String[] args) {

		System.out.println("canPack(1, 0, 4) should return false, it returned:" + canPack(1, 0, 4));
		System.out.println("canPack(1, 0, 5) should return true, it returned:" + canPack(1, 0, 5));
		System.out.println("canPack(0, 5, 4) should return true, it returned:" + canPack(0, 5, 4));
		System.out.println("canPack(2 ,2 , 11) should return true, it returned:" + canPack(2, 2, 11));
		System.out.println("canPack(-3, 2, 12) should return false, it returned:" + canPack(-3, 2, 12));
		System.out.println("canPack(1, 0, 6) should return false, it returned:" + canPack(1, 0, 6));
		System.out.println("canPack(0, 5, 5) should return true, it returned:" + canPack(0, 5, 5));
		System.out.println("canPack(2, 1, 5) should return true, it returned:" + canPack(2, 1, 5));
		System.out.println("canPack(2, 10, 18) should return true, it returned:" + canPack(2, 10, 18));
		System.out.println("canPack(0, 5, 6) should return false, it returned:" + canPack(0, 5, 6));
		System.out.println("canPack(5, 3, 24) should return false, it returned:" + canPack(5, 3, 24));
		System.out.println("canPack(2, 7, 18) should return false, it returned:" + canPack(2, 7, 18));
		System.out.println("canPack(2, 10, 20) should return true, it returned:" + canPack(2, 10, 20));
		System.out.println("canPack(4, 18, 19) should return true, it returned:" + canPack(4, 18, 19));

	}

	/*
	 * System.out.println( "goal je: " + goal + " ,a bigCount*i+j je: " + bigCount *
	 * i + j );
	 */

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		for (int i = 0; i <= bigCount; i++) {
			for (int j = 0; j <= smallCount; j++) {

				if (goal == (5 * i) + j)
					return true;
			}
		}

		return false;
	}

	public static boolean canPack8(int bigCount, int smallCount, int goal) {

		if (bigCount == 0 && smallCount >= goal) {
			return true;
		} else {
			for (int i = 1; i <= bigCount; i++) {
				for (int j = 0; j <= smallCount; j++) {

					if (goal == (5 * i) + j)
						return true;
				}
			}
		}

		return false;
	}

	public static boolean canPack6(int bigCount, int smallCount, int goal) {

		int howManyTimesDividesFive = goal / 5;
		int remainderOfGoal = goal % 5;

		if (bigCount < 0 || smallCount < 0 || goal < 0)
			return false;

		if (bigCount == 0) {
			if (smallCount >= goal) {
				return true;
			} else
				return false;
		}

		if (goal % bigCount * 5 <= smallCount)
			return true;

		return false;

	}

	public static boolean canPack7(int bigCount, int smallCount, int goal) {

		if (bigCount < 0 || smallCount < 0 || goal < 0)
			return false;

		while (smallCount > 5) {
			bigCount++;
			smallCount -= 5;
		}

		if (smallCount == 5 && goal % 5 == 0) {
			return true;
		}

		if (goal / 5 <= bigCount && goal % 5 <= smallCount) {
			return true;
		} else if (bigCount == 0) {
			if (smallCount >= goal)
				return true;
		}

		return false;

	}

	public static boolean canPack5(int bigCount, int smallCount, int goal) {

		if (bigCount < 0 || smallCount < 0 || goal < 0)
			return false;

		if (goal - (bigCount * 5 + smallCount) > 0) {
			return false;
		}

		return true;

	}

	public static boolean canPack4(int bigCount, int smallCount, int goal) {

		// int goalBigRem = goal / 5;
		// int goalSmallRem = goal %5;
		// System.out.println("goalBigRem: "+ goalBigRem);
		// System.out.println("goalSmallRem: "+ goalSmallRem);

		if (bigCount < 0 || smallCount < 0 || goal < 0)
			return false;

		if (bigCount == 0) {
			if (goal <= smallCount)
				return true;
		} else if (goal % 5 == 0 || goal % 5 <= smallCount) {
			return true;
		}

		return false;

	}

	public static boolean canPack2(int bigCount, int smallCount, int goal) {

		// int goalBigRem = goal / 5;
		// int goalSmallRem = goal %5;
		// System.out.println("goalBigRem: "+ goalBigRem);
		// System.out.println("goalSmallRem: "+ goalSmallRem);

		if (bigCount < 0 || smallCount < 0 || goal < 0)
			return false;

		if (bigCount * 5 + smallCount >= goal && goal / 5 >= bigCount)
			return true;
		return false;

	}

	public static boolean canPack3(int bigCount, int smallCount, int goal) {

		// int goalBigRem = goal / 5;
		// int goalSmallRem = goal %5;
		// System.out.println("goalBigRem: "+ goalBigRem);
		// System.out.println("goalSmallRem: "+ goalSmallRem);

		if (bigCount < 0 || smallCount < 0 || goal < 0)
			return false;

		if (goal > 5) {
			if (bigCount * 5 + smallCount >= goal)
				return true;
		} else {
			if (goal / 5 == bigCount || goal % 5 <= smallCount)
				return true;
		}
		return false;
	}

}
