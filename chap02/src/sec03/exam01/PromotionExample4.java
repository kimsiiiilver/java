package sec03.exam01;

import java.util.Scanner;


public class PromotionExample4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //s�� Ű����� ģ ���� ���(?)
		System.out.println("��� �б��� �Է��ϼ���. ��) 00��, 00��");
		String a = s.next(); // next ���ڿ��� �޴� ��
		char b = a.charAt(2);
		
		System.out.println("���� ���г� �Դϱ�? ��_ 1,2,3");
		int c = s.nextInt(); 
		
		
		
		if(b=='��') {
			System.out.println("����� ���б� " + c + "�г��Դϴ�.");
		} else {
			System.out.println("����� ����б� " + c + "�г��Դϴ�.");
		}
		
		
		
		
		
		
		
		
	}

}