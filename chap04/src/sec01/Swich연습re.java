package sec01;

import java.util.Scanner;

public class Swich����re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ڵ带 �Է��� �ּ���.");
		String code = s.next();

		// �����ڵ� : A����1234, B����4567, C����9874
		// A �λ�� B ��ȹ�� C �ѹ���
		// ���ʽ� �ݾ� ���� 100, ���� 70, ���� 50
		// ��) A����1234-> �λ�� ����� ���ʽ� �ݾ��� 1,000,000�� �Դϴ�.
		// ���ڿ� Ư�� �κ� ���� -> substring(1,3)
		String p = code.substring(1, 3);
		String a;
		switch (code.charAt(0)) {
		case 'A':
			a = "�λ��";
			break;
		case 'B':
			a = "��ȹ��";
			break;
		default:
			a = "�ѹ���";
		}
		String m;
		switch (p) {
		case "����":
			m = "�鸸��";
			break;
		case "����":
			m = "ĥ�ʸ���";
			break;
		default:
			m = "���ʸ���";
		}
		System.out.printf("%s %s���� ���ʽ� �ݾ��� %s�Դϴ�.", a, p,m);
	}
	
}
