package sec03.exam07;

import java.util.Scanner;

public class 문자를기본타입으로변환 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("첫번째 숫자를 입력하세요.");
		String a = s.next();

		System.out.println("두번째 숫자를 입력하세요.");
		String b = s.next();

		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int sum = c + d;
		System.out.println("두 수의 합계는 : " + sum + "입니다.");

		
		// Integer.parselnt 문자열 -> 숫자(int)
		// String.valueOf(타입값) 타입값 -> 문자
	}

}
