package sec01;

import java.util.Scanner;

public class if����6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int num = s.nextInt();

		if (num %2 == 0) {
			System.out.println(num +"��(��) ¦���Դϴ�.");
		} else {
			System.out.println(num +"��(��)Ȧ���Դϴ�");
		}
	}

}
