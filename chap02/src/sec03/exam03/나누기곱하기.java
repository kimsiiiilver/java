package sec03.exam03;

import java.util.Scanner;

public class ��������ϱ� {

	public static void main(String[] args) {

		// ù ��° ���ڸ� �Է��ϼ��� �� 30
		// �� ��° ���ڸ� �Է��ϼ��� �� 50
		// ���� ��ȣ�� �Է��ϼ���(*,/) �� *
		// �Է��Ͻ� ������ ����� 1500�Դϴ�.

		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int a = s.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int b = s.nextInt();

		System.out.println("���� ��ȣ�� �Է��ϼ���.");
		String c = s.next();
		char d = c.charAt(0);

		if (d== '*') {
			int e = a * b;
			System.out.println("�Է��Ͻ� ������ ����� " + e + "�Դϴ�.");
		} else {
			double f = (double) a / b;
			System.out.println("�Է��Ͻ� ������ ����� " + f + "�Դϴ�.");
		}

	

	}

}
