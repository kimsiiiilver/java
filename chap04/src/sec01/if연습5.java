package sec01;

import java.util.Scanner;

public class if����5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = s.nextInt();

		if (num % 2 == 0 && num % 5 == 0 && num != 0) {
			System.out.println("2�� 5�� ����Դϴ�.");
		} else {
			System.out.println("2�� 5�� ����� �ƴմϴ�");
		}
	}

}
