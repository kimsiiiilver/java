package sec05;

import java.util.Scanner;

public class Ȯ�ι���4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String name = s.next();
		System.out.println("2.�ֹι�ȣ �� 6�ڸ�: ");
		String num1 = s.next();
		System.out.println("��ȭ��ȣ: ");
		String num2 = s.next();
		
		System.out.println("[�Է��� ����]");
		System.out.printf("%s���� �ֹι�ȣ�� %s �̰� ����ó�� %s�Դϴ�."  ,name, num1, num2);
		//System.out.printf(name +"���� �ֹι�ȣ�� " + num1 +"�̰� ����ó�� "+ num2+"�Դϴ�.");
		
		
		

	}

}
