package sec02;

import java.util.Scanner;

public class Ȯ�ι���9re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		String a = s.next();
		System.out.println("�� ��° ���� �Է��ϼ���");
		String b = s.next();
		
		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);
		double result = c/d;
		
		if(d==0|d==0.1) {
			System.out.println("��� "+" ���Ѵ�");
		} else {
			System.out.println("��� " +result);
		}
		

	}

}
