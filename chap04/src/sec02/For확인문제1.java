package sec02;

import java.util.Scanner;

public class ForȮ�ι���1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���(1~100����)");
		int num = s.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1���� %d������ �հ�� : %d �Դϴ�.",num,sum);
	}

}
