package sec01;

import java.util.Scanner;

public class if연습6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num = s.nextInt();

		if (num %2 == 0) {
			System.out.println(num +"는(은) 짝수입니다.");
		} else {
			System.out.println(num +"는(은)홀수입니다");
		}
	}

}
