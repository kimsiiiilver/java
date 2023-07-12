package sec02;

public class º°Âï±â {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int c = 1; c <= i; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int c = 4; c >= i; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
