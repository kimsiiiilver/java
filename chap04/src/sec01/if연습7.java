package sec01;

import java.util.Scanner;

public class if����7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("��ǰ ���� : ");
		int num = s.nextInt();

		float price;

		if (num >= 8) {
			price = 7000 * num * 0.9f; //num * 6300( ���ʿ� ���ΰ��� �Է�)
		} else {
			price = 7000 * num;
		}
		System.out.printf("������ %.0f�� �Դϴ�.", price);
	}

}
