package sec02;

import java.util.Scanner;

import sec01.switch����1;

public class Ȯ�ι���5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// �ܰ� balance, ���� deposit, ��� withdraw
		System.out.println("�������࿡ �湮�Ͻ� ���� ȯ���մϴ�.");
		int balance = 0; // ���� �ܰ� 0���� ����
		int deposit, withdraw;
		boolean run = true;

		while (run) {
			System.out.println("������ 1��, ����� 2��, �ܰ�Ȯ���� 3��, ����� 4���Դϴ�. ");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("�Ա� �ݾ��� ���Դϱ�?");
				deposit = s.nextInt();
				balance += deposit;
				System.out.println("���� �ݾ��� " + balance + "�� �Դϴ�.");
				break;
			case 2:
				System.out.println("��� �ݾ��� ���Դϱ�?");
				withdraw = s.nextInt();
				if (balance < withdraw) {
					System.out.println("���� �ܾ��� �����մϴ�.");
				} else {
					balance -= withdraw;
					System.out.println("���� �ݾ��� " + balance + "�� �Դϴ�.");
				}
				break;
			case 3:
				System.out.println("������ ���� �ܾ��� " + balance + "���Դϴ�.");
				break;
			default:
				System.out.println("�����մϴ�.");
				run = false;

			}
		}
	}
}
