package sec03.exam07;

import java.util.Scanner;

public class ���ڸ��⺻Ÿ�����κ�ȯ {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		String a = s.next();

		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		String b = s.next();

		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int sum = c + d;
		System.out.println("�� ���� �հ�� : " + sum + "�Դϴ�.");

		
		// Integer.parselnt ���ڿ� -> ����(int)
		// String.valueOf(Ÿ�԰�) Ÿ�԰� -> ����
	}

}
