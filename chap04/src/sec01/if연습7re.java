package sec01;

import java.util.Scanner;

public class if����7re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("��ǰ ���� : ");
		int num = s.nextInt();

		int price;

		if (num >= 8) {
			price = (int) (7000 * 0.9) * num;
		} else {
			price = 7000*num;
		}
		System.out.println("������ " + price + "�� �Դϴ�.");
				
	}
}
