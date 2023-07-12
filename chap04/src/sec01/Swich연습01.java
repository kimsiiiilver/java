package sec01;

import java.util.Scanner;

public class Swich연습01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("사용자 코드를 입력해 주세요.");
		// 사용자 코드 A115, B113, C119, a115, b113, c119 대소문자 동일하게 인식
		String code = s.next();

		switch (code.charAt(0)) {
			case 'A':
			case 'a':
				System.out.println("인사부에 배정되셨습니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("기획부에 배정되셨습니다.");
				break;
			default:
				System.out.println("총무부에 배정되셨습니다.");
		}
	}

}
