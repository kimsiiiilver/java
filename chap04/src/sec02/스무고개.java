package sec02;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �ϳ� �Է��ϼ���(1~20) : ");

		int comNum = (int) (Math.random() * 20) + 1;

		while (true) {
			int userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (userNum > comNum) {
				System.out.println("���ڸ� �ٽ� �Է��ϼ���(Down)");
			} else {
				System.out.println("���ڸ� �ٽ� �Է��ϼ���(up)");
			}
			
		}

	}

}
