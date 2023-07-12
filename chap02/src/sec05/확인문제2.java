package sec05;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 수:");
		String num1 = s.next();
		System.out.print("두번째 수:");
		String num2 = s.next();

		// 첫번째 수와 두번째 수가 같으면 "두 수가 같아요"
		// 첫 번째 수와 두 번째 수가 다르면 "두 수가 달라요"

		if (num1.equals(num2)) {
			System.out.println("두 수가 같아요");
		} else {
			System.out.println("두 수가 달라요");
		}

	}

}
