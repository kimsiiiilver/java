package sec01;

import java.util.Scanner;

public class Swich연습02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("직원 코드를 입력해 주세요.");
		String code = s.next();

		// 직원코드 : A부장1234, B과장4567, C차장9874
		// A 인사부 B 기획부 C 총무부
		// 보너스 금액 부장 100, 과장 70, 차장 50
		// 예) A부장1234-> 인사부 부장님 보너스 금액은 1,000,000원 입니다.
		// 문자열 특정 부분 추출 -> substring(1,3)

		switch (code.charAt(0)) {
		case 'A':
			System.out.print("인사부 ");
			break;
		case 'B':
			System.out.print("기획부 ");
			break;
		default:
			System.out.print("총무부 ");
		}

		switch (code.substring(1, 3)) {
			case "부장":
				System.out.println("부장님 보너스 금액은 백만원입니다.");
				break;
			case "과장":
				System.out.println("과장님 보너스 금액은 칠십만원입니다.");
				break;
			default:
				System.out.println("차장님 보너스 금액은 오십만원입니다.");
		}
	}
}
