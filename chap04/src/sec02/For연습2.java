package sec02;

import java.util.Scanner;

public class For연습2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수입력 1 : ");
		int a = s.nextInt();
		System.out.print("정수입력 2 : ");
		int b = s.nextInt();

		if (a > b) {
			int c = a;
			a = b;
			b = c;
		}

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
