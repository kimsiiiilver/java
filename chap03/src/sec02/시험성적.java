package sec02;

import java.util.Scanner;

public class ���輺�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("���� ��й�ȣ�� �Է��� �ּ���");
		String pass = s.next();
		// ��й�ȣ�� ���� �ҹ��ڿ� ������ ���� a5, a7
		// ����ڰ� ��й�ȣ�� ����� �Է������� 'ȯ���մϴ�'���
		// ��й�ȣ ���� �� '��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�.' �ȳ��� ���

		char a = pass.charAt(0);
		char b = pass.charAt(1);
		if ((a >= 97) && (a <= 122) && (b >= 48) && (b <= 57)) {
			System.out.println(name + "�� ȯ���մϴ�.");
		} else {
			System.out.println("��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�");
		}

		System.out.println("�߰���� ������ �Է��� �ּ���");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������ �Է��� �ּ���");
		int last = s.nextInt();

		int c = mid;
		int d = last;

		// �߰���簡 80�� �̻��̰ų� �⸻��簡 80�� �̻��̸� "���" �ƴϸ� "Ż��"

		if ((c >= 80) || (d >= 80)) {
			System.out.println("���");
		} else {
			System.out.println("Ż��");
		}

	}
}
