package sec02;

import java.util.Scanner;

public class �����հ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���(1~20����)");
		int a = s.nextInt();
		System.out.println("�� ��° ���� �Է��ϼ���(1~20����)");
		int b = s.nextInt();

		int result = 0;

		// ù��° ���ڰ� 5, �ι�° ���ڰ� 8
		// 5+6+7+8 ����� ��� if, ++ ������ �ϱ�

		while (true) {
			if (a <= b) {
				result += a;  //result = result+a;
				a++;
			} else {
				break;
			}
		}
		System.out.println("�� ���� ���� �հ�� : " + result);

	}

}
