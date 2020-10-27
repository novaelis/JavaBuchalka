package MegaBytesConverter;

public class MegaBytesAndKiloBytes {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
		printMegaBytesAndKiloBytes(0);
		
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		if (kiloBytes <= 0) {
			System.out.println("Invalid Value");
		}else {
			int megaBytes = kiloBytes / 1024;
			int remainKyloBytes = kiloBytes % 1024;

			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainKyloBytes + " KB");
		}
	}

}
