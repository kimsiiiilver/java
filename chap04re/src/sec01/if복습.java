package sec01;

import java.util.Scanner;

public class if���� {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("���� ������ �̸��� �����ΰ���?");
		String name = s.next();
		System.out.println("������ ������ �� ���ΰ���?");
		int point = s.nextInt();

		String grade;

		if (point >= 8) {
			grade = "�ֻ��";
		} else if (point >= 5) {
			grade = "�߱�";
		} else {
			grade = "�ϱ�";
		}

		System.out.println(name + "���� ����� " + grade + "�Դϴ�.");
	}

}
