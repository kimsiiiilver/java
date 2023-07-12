package sec02;

import java.util.Scanner;

public class For확인문제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력1 : ");
		int a = s.nextInt();
		System.out.print("정수 입력2 : ");
		int b = s.nextInt();

		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}

		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
			if (i == b) {
				System.out.printf("%d=%d", i, sum);
			} else {
				System.out.printf("%d+", i);

			}

		}

	}

}
