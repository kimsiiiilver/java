package sec01;

import java.util.Scanner;

public class Swich����01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �ڵ带 �Է��� �ּ���.");
		// ����� �ڵ� A115, B113, C119, a115, b113, c119 ��ҹ��� �����ϰ� �ν�
		String code = s.next();

		switch (code.charAt(0)) {
			case 'A':
			case 'a':
				System.out.println("�λ�ο� �����Ǽ̽��ϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("��ȹ�ο� �����Ǽ̽��ϴ�.");
				break;
			default:
				System.out.println("�ѹ��ο� �����Ǽ̽��ϴ�.");
		}
	}

}
