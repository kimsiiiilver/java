	package sec03.exam07;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.");
		int money = s.nextInt();
		
		System.out.println("�������� :" + money / 50000 + "��");
		money = money %50000;
		System.out.println("������ : " + money / 10000 +"��");
		money = money %10000;
		System.out.println("õ���� : " + money / 1000 +"��");
		money = money %1000;
		System.out.println("��� : " + money / 100 +"��");
		money = money %100;
		System.out.println("�ʿ� : " + money / 10 +"��");
		money = money %10;
		
		
		
		
	}

}
