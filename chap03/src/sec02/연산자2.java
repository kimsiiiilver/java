package sec02;

import java.util.Scanner;


public class ������2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("x�� �ʱⰪ�� �Է��� �ּ���");
		int x = s.nextInt();
		System.out.println("y�� �ʱⰪ�� �Է��� �ּ���");
		int y = s.nextInt();
		System.out.println("���� ��ȣ�� �Է��� �ּ���(+,-)");
		String a = s.next();
		
	
		if(a.equals("+")) {
			System.out.println(++x);
		} else {
			System.out.println(--y);
			
		}

	}

}
