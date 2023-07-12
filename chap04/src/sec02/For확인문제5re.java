package sec02;

import java.util.Scanner;

public class For확인문제5re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("단 수를 입력하세요.");
		int num1 = s.nextInt();

		for (int i = 1; i <= 9; i++) {
			//System.out.println(num1 + " * " + i + " = " + (num1 * i));
			System.out.printf("%d * %d = %d\n",num1,i,num1*i);
		}

	}

}
