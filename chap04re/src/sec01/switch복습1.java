package sec01;

import java.util.Scanner;

public class switch����1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("���� ������ �̸��� �����ΰ���?");
		String name = s.next();
		System.out.println("������ ������ �� ���ΰ���?");
		int point = s.nextInt();

		String grade;

		switch (point) {
		case 10:
		case 9:
		case 8:
			grade = "�ֻ��";
			break;
		case 7:
		case 6:
		case 5:
			grade = "�߱�";
			break;
		default:
			grade = "�ϱ�";
		}
		System.out.printf("%s���� ������ %s�Դϴ�.",name,grade);
	}

}
