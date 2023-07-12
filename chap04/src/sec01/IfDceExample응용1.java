package sec01;

import java.util.Scanner;

public class IfDceExample응용1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1 = (int) (Math.random() * 6) + 1;

		System.out.println("1~6사이 숫자를 입력하세요");
		int num2 = s.nextInt();

		System.out.println("컴퓨터 수 : " + num1);
		System.out.println("사용자 수 : " + num2);

		if (num1 == num2) {
			System.out.println("두 수가 일치합니다.");
		} else if (num1 > num2) {
			System.out.println("컴퓨터 숫자가 더 큽니다.");
		} else {
			System.out.println("사용자 숫자가 더 큽니다.");
		}
	}
}
