package sec01;

import java.util.Scanner;

public class if����8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num1 = s.nextInt();
		System.out.print("���� ���� : ");
		int num2 = s.nextInt();
		System.out.print("���� ���� : ");
		int num3 = s.nextInt();

		int sum = num1 + num2 + num3;

        //1
		if (num1 > 6 && num2 > 6 && num3 > 6 && sum >= 30) {
			System.out.println("�հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�!");
		}

        //2		
		if (num1 <= 6 || num2 <= 6 || num3 <= 6 || sum < 30) {
			System.out.println("���հ��Դϴ�!");
		} else {
			System.out.println("�հ��Դϴ�!");
		}
	}

}
