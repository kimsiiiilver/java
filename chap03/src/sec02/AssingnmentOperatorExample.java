package sec02;

import java.util.Scanner;

public class AssingnmentOperatorExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 100;
		System.out.println("���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		String b = s.next();

		// ��) ���� 5, ������ -�� �Է������� ���տ����ڸ� �̿��Ͽ�
		// 100���� 5�� �� num1�� ����� ��� num1 -=5;

		if (b.equals("+")) {
			num1 += a;
		}
		if (b.equals("-")) {
			num1 += a;
		}
		if (b.equals("*")) {
			num1 += a;
		}
		if (b.equals("/")) {
			num1 += a;
		}
		if (b.equals("%")) {
			num1 += a;
		}

		System.out.println("������� : " + num1);

	}

}
