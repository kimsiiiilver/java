package sec03.exam01;

import java.util.Scanner;


public class PromotionExample2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //s�� Ű����� ģ ���� ���(?)
		System.out.println("��� �б��� �Է��ϼ���. ��) 00��, 00��");
		String a = s.next(); // next ���ڿ��� �޴� ��
		char b = a.charAt(2);
		
		if(b=='��') {
			System.out.println("����� ���л��Դϴ�.");
		} else {
			System.out.println("����� ����л��Դϴ�.");
		}
		
		
		
		
		
		
		
		
	}

}