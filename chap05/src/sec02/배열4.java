package sec02;

import java.util.Scanner;

public class �迭4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��� �ּ���.");
		int a = s.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��� �ּ���.");
		int b = s.nextInt();

		int[] c = new int[2];// 2���� ������ ���� int �迭 ����
		c[0]=a;
		c[1]=b;
		int sum =c[0]+c[1];
		System.out.println("�հ� : "+sum);
	}

}
