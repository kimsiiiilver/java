package sec02;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 복습문제1 {

	public static void main(String[] args) {
		/*
		 * 학습코드를 입력하세요 학습코드는 20M456, 22K123, 23E447 앞 2개 숫자는 신청년도 세번째 문자는 과목을 나타냅니다. M
		 * 수학, K국어, E영어 예 22K123->22년도 국어과목 신청자입니다.
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("학습코드를 입력하세요");
		String code = s.next();

		String y = code.substring(0, 2);
		String v;
		switch (code.charAt(2)) {
			case 'M':
				v = "수학";
				break;
			case 'K':
				v = "국어";
				break;
			default:
				v = "영어";
		}
		System.out.printf("20%s년도 %s 과목 신청자입니다.", y, v);
	}

}
