package sec02;

import java.util.Scanner;

public class Ȯ�ι���11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���̵� :");
		String name = scanner.nextLine();

		System.out.println("�н����� :");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);

		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}

	}

}
