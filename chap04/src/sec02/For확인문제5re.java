package sec02;

import java.util.Scanner;

public class ForȮ�ι���5re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���.");
		int num1 = s.nextInt();

		for (int i = 1; i <= 9; i++) {
			//System.out.println(num1 + " * " + i + " = " + (num1 * i));
			System.out.printf("%d * %d = %d\n",num1,i,num1*i);
		}

	}

}
