package sec02;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�ٷνð��� �Է��ϼ���.");
		int m = s.nextInt();
		double result = (m >= 10) ? m * 9620 * 1.2 : m * 9620;
		
		System.out.println((int)result);

	}

}
