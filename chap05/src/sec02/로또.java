package sec02;

import java.util.Scanner;

public class 로또 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("로또 몇 게임을 하시겠습니까?");
		int num1 = s.nextInt();

		int[] lotto = new int[6];
		int sum = 0;

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < 6; j++) {

				lotto[j] = (int) (Math.random() * 45) + 1;

				for (int k = 0; k < j; k++) {
					if (lotto[j] == lotto[k]) {
						i--;
						break;
					}
				}

				System.out.printf("%2d ", lotto[j]);
			}
			System.out.println();
		}
	}

}
