package sec02;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л� ���� �Է��ϼ���");
		int st = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int p = s.nextInt();
		
		int a = p/st;
		int b = p % st;
		System.out.println("�л� �� ��� " + a + "���� ������ �������� " + b + "���� ���ƿ�");
		

		

	}

}
