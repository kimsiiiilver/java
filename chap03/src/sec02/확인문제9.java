package sec02;

import java.util.Scanner;

public class Ȯ�ι���9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ��:");
		double a = Double.parseDouble(s.next());
		System.out.println("�� ��° ��:");
		double b = Double.parseDouble(s.next());
		
		
		
		System.out.println("--------------------------");
		if(b !=0.0) {
			System.out.println("��� "+ (a/b));
		} else {
			System.out.println("��� + ���Ѵ�");
		}
		

	}

}
