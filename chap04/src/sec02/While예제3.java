package sec02;

import java.util.Scanner;

public class While예제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요(1~20)");
		int userNum = s.nextInt();
		// 랜덤으로 숫자 추출 (1~20)
		int comNum = (int) (Math.random() * 20) + 1;

		if (userNum == comNum) {
			System.out.println("정답입니다.");

		} else {
			System.out.println("오답입니다.");
		}
		System.out.println("사용자 숫자: " + userNum);
		System.out.println("사용자 숫자: " + comNum);
	}

}
