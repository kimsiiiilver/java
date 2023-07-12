package sec01;

import java.util.Scanner;

public class Swich연습re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("직원 코드를 입력해 주세요.");
		String code = s.next();

		// 직원코드 : A부장1234, B과장4567, C차장9874
		// A 인사부 B 기획부 C 총무부
		// 보너스 금액 부장 100, 과장 70, 차장 50
		// 예) A부장1234-> 인사부 부장님 보너스 금액은 1,000,000원 입니다.
		// 문자열 특정 부분 추출 -> substring(1,3)
		String p = code.substring(1, 3);
		String a;
		switch (code.charAt(0)) {
		case 'A':
			a = "인사부";
			break;
		case 'B':
			a = "기획부";
			break;
		default:
			a = "총무부";
		}
		String m;
		switch (p) {
		case "부장":
			m = "백만원";
			break;
		case "과장":
			m = "칠십만원";
			break;
		default:
			m = "오십만원";
		}
		System.out.printf("%s %s님의 보너스 금액은 %s입니다.", a, p,m);
	}
	
}
