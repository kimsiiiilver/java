package sec02;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ������ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("���ֽø������� �湮�� ȯ���մϴ�.");

		boolean run = true;
		int sum1 = 0;
		int sum2 = 0;

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("�۾��ڵ�� ������ �Է����ּ���."); // A(����)2(å ��), B(�ݳ�)2, C(����)0
			System.out.println("A�� ����, B�� �ݳ�, C�� �����Դϴ�.");
			String code = s.next();
			String a = code.substring(1);
			int b = Integer.parseInt(a);

			switch (code.charAt(0)) {
			case 'A':
				System.out.println("å" + b + "���� �����մϴ�.");
				sum1 += b;
				break;
			case 'B':
				System.out.println("å" + b + "���� �ݳ��մϴ�.");
				sum2 += b;
				break;
			default:
				System.out.println("�����մϴ�.");
				run = false;
			}
		}

	}

}
