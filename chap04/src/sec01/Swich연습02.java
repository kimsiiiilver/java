package sec01;

import java.util.Scanner;

public class Swich����02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ڵ带 �Է��� �ּ���.");
		String code = s.next();

		// �����ڵ� : A����1234, B����4567, C����9874
		// A �λ�� B ��ȹ�� C �ѹ���
		// ���ʽ� �ݾ� ���� 100, ���� 70, ���� 50
		// ��) A����1234-> �λ�� ����� ���ʽ� �ݾ��� 1,000,000�� �Դϴ�.
		// ���ڿ� Ư�� �κ� ���� -> substring(1,3)

		switch (code.charAt(0)) {
		case 'A':
			System.out.print("�λ�� ");
			break;
		case 'B':
			System.out.print("��ȹ�� ");
			break;
		default:
			System.out.print("�ѹ��� ");
		}

		switch (code.substring(1, 3)) {
			case "����":
				System.out.println("����� ���ʽ� �ݾ��� �鸸���Դϴ�.");
				break;
			case "����":
				System.out.println("����� ���ʽ� �ݾ��� ĥ�ʸ����Դϴ�.");
				break;
			default:
				System.out.println("����� ���ʽ� �ݾ��� ���ʸ����Դϴ�.");
		}
	}
}
