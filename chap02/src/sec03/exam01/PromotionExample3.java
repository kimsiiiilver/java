package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //s�� Ű����� ģ ���� ���(?)
		System.out.println("�� ���ڸ� �Է��ϼ���");
		String a = s.next(); // next ���ڿ��� �޴� ��
		char b = a.charAt(0); //'0'�� ������ �� - string -> char�� ��ȯ, charAt(����) ���ڿ����� �ش� ���� ��ġ�� �ش��ϴ� ���ڿ��� charŸ������ ��ȯ
		int c = b; // char -> int�� ��ȯ
		
	
		System.out.println("�Է��Ͻ� "+ a + "�� �����ڵ� ����" + c + "�Դϴ�");
	 
		//toString(������) �����͸� string Ÿ������ ��ȯ
		
		
		
	}

}