package sec01;

import java.util.Scanner;

public class IfElse����1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�߰���� ������?");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������?");
		int last = s.nextInt();

		/*
		 * �߰����� �⸻��� ��� ������ 90�� �̻��̸� "a����" �߰����� �⸻��� ��������� 80�� �̻��̸� "b����" ��������
		 * "c����"�̵�, ��� �� �����̶� 60�̸��̸� "�����"
		 */

		int a = (mid + last) / 2;
		if (mid < 60 || last < 60) {
			System.out.println("�����");
		} else if (a >= 90) {
			System.out.println("A����");
		} else if (a >= 80) {
			System.out.println("B����");
		} else {
			System.out.println("C����");
		}
	}

}
