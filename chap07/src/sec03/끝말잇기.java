package sec03;

import java.util.Scanner;

public class �����ձ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�����ձ� ������ �����մϴ�.");
		System.out.println("���ӿ� �����ϴ� �ο��� �� �� �Դϱ�?>>");
		int user = s.nextInt();

		String[] name = new String[user];
		String[] game = new String[user];

		for (int i = 0; i < user; i++) {
			System.out.println("�������� �̸��� �Է��ϼ���>>");
			name[i] = s.next();
		}

		System.out.println("�����ϴ� �ܾ�� �ƹ��� �Դϴ�.");
		game[user - 1]="�ƹ���";
		a: while (true) {
			for (int i = 0; i < user; i++) {
				System.out.print(name[i] + ">>");
				game[i] = s.next();

				if (i == 0 && game[i].charAt(0) != game[user - 1].charAt(game[user - 1].length() - 1)) {
					System.out.println(name[i] + "���� �����ϴ�.");
					break a;
				}
				if (i != 0 && game[i].charAt(0) != game[i - 1].charAt(game[i - 1].length() - 1)) {
					System.out.println(name[i] + "���� �����ϴ�.");
					break a;
				}
			}

		}
	}

}
