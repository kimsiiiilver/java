package sec02;

import java.util.Scanner;

public class While����3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��ϼ���(1~20)");
		int userNum = s.nextInt();
		// �������� ���� ���� (1~20)
		int comNum = (int) (Math.random() * 20) + 1;

		if (userNum == comNum) {
			System.out.println("�����Դϴ�.");

		} else {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("����� ����: " + userNum);
		System.out.println("����� ����: " + comNum);
	}

}
