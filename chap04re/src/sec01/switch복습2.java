package sec01;

import java.util.Scanner;

public class switch����2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("�а� �ڵ带 �����ΰ���?");
		String code = s.next();
		// a ���а� b �濵�а� c�����а�
		// a123->���а� �л��Դϴ�.

		String student;

		switch (code.charAt(0)) {
		case 'A':
			student = "���а�";
			break;
		case 'B':
			student = "�濵�а�";
			break;
		default:
			student = "�����а�";
		}
		System.out.printf("%s �л��Դϴ�.",student);

	}

}
