package sec01;

import java.util.Scanner;

public class SwitchDceExample����2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ȣ�� �Է��ϼ���"); //030507B
		String tn = s.next();
		char room = tn.charAt(6);

		switch (room) {
			case 'A':
				System.out.println("������Ұ� 201ȣ�Դϴ�.");
				break;
			case 'B':
				System.out.println("������Ұ� 202ȣ�Դϴ�.");
				break;
			default:
				System.out.println("������Ұ� 203ȣ�Դϴ�.");
		}
	}
}
