package sec01;

import java.util.Scanner;

public class if����4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = s.nextInt();

		if (num % 3 == 0 && num !=0) { 
			System.out.println("3�� ��� �Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�");
		}
	}

}
