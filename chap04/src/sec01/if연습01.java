package sec01;

import java.util.Scanner;

public class if����01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("0~100���� ���ڸ� �ϳ� �Է��ϼ���.");
		int a = s.nextInt();

		System.out.println("a�� ���� : " + a);
		if (a >= 90) {
			System.out.println("a�� 90�̻� �Դϴ�.");
		} else if (a >= 80) {
			System.out.println("a�� 80�̻� �Դϴ�.");
		} else if (a >= 70) {
			System.out.println("a�� 70�̻� �Դϴ�.");
		} else if (a >= 80) {
			System.out.println("a�� 60�̻� �Դϴ�.");
		} else {
			System.out.println("a�� 50���� �Դϴ�.");

}

	}

}
