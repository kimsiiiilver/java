package sec01;

import java.util.Scanner;

public class if����2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int score = s.nextInt();
		
		if (score>=50) {
			System.out.println("���� : " + score);
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���� : " + score);
			System.out.println("������� ������");
		}
		
	}

}
