package sec01;

import java.util.Scanner;

public class if����3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���ڴ�?");
		int num1 = s.nextInt();
		System.out.println("�� ��° ���ڴ�?");
		int num2 = s.nextInt();

		if (num1 > num2) {
			System.out.println("ù ��° ���ڰ� Ů�ϴ�.");
		}
		if (num1 < num2) {
			System.out.println("�� ��° ���ڰ� Ů�ϴ�");
		}
		if (num1 == num2) {
			System.out.println("�� ���ڰ� �����ϴ�.");
		}
	}

}
