package sec05;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ��:");
		String num1 = s.next();
		System.out.print("�ι�° ��:");
		String num2 = s.next();

		// ù��° ���� �ι�° ���� ������ "�� ���� ���ƿ�"
		// ù ��° ���� �� ��° ���� �ٸ��� "�� ���� �޶��"

		if (num1.equals(num2)) {
			System.out.println("�� ���� ���ƿ�");
		} else {
			System.out.println("�� ���� �޶��");
		}

	}

}
