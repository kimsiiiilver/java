package sec01;

import java.util.Scanner;

public class IfDceExample����1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1 = (int) (Math.random() * 6) + 1;

		System.out.println("1~6���� ���ڸ� �Է��ϼ���");
		int num2 = s.nextInt();

		System.out.println("��ǻ�� �� : " + num1);
		System.out.println("����� �� : " + num2);

		if (num1 == num2) {
			System.out.println("�� ���� ��ġ�մϴ�.");
		} else if (num1 > num2) {
			System.out.println("��ǻ�� ���ڰ� �� Ů�ϴ�.");
		} else {
			System.out.println("����� ���ڰ� �� Ů�ϴ�.");
		}
	}
}
