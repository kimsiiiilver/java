package sec02;

import java.util.Scanner;

public class While��������1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num1 = s.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= num1) {
			sum += i;
			i++;

		}
		System.out.println("1 ~ " + num1 + "�� : " + sum);
	}

}
