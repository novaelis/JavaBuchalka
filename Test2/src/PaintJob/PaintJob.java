package PaintJob;

public class PaintJob {

	public static void main(String[] args) {
		System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

		System.out.println(getBucketCount(-3.4, 2.1, 1.5));
		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));

		System.out.println(getBucketCount(3.4, 1.5));
		System.out.println(getBucketCount(6.26, 2.2));
		System.out.println(getBucketCount(3.26, 0.75));
		
		System.out.println(getBucketCount(0.0, 2.1,1.5,7));
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {

		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
			return -1;
		}

		double area = width * height;
		int neededBuckets = (int) Math.ceil(area / areaPerBucket);

		return neededBuckets - extraBucket;

	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {

		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double area = width * height;
		int neededBuckets = (int) Math.ceil(area / areaPerBucket);

		return neededBuckets;

	}

	public static int getBucketCount(double area, double areaPerBucket) {

		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		int neededBuckets = (int) Math.ceil(area / areaPerBucket);

		return neededBuckets;

	}
}
