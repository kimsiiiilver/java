package sec02;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ��������1 {

	public static void main(String[] args) {
		/*
		 * �н��ڵ带 �Է��ϼ��� �н��ڵ�� 20M456, 22K123, 23E447 �� 2�� ���ڴ� ��û�⵵ ����° ���ڴ� ������ ��Ÿ���ϴ�. M
		 * ����, K����, E���� �� 22K123->22�⵵ ������� ��û���Դϴ�.
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("�н��ڵ带 �Է��ϼ���");
		String code = s.next();

		String y = code.substring(0, 2);
		String v;
		switch (code.charAt(2)) {
			case 'M':
				v = "����";
				break;
			case 'K':
				v = "����";
				break;
			default:
				v = "����";
		}
		System.out.printf("20%s�⵵ %s ���� ��û���Դϴ�.", y, v);
	}

}
