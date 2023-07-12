package sec02;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("접속 비밀번호를 입력해 주세요");
		String pass = s.next();
		// 비밀번호는 영어 소문자와 숫자의 조합 a5, a7
		// 사용자가 비밀번호를 제대로 입력했으면 '환영합니다'출력
		// 비밀번호 오류 시 '비밀번호는 영어 소문자와 숫자의 조합입니다.' 안내문 출력

		char a = pass.charAt(0);
		char b = pass.charAt(1);
		if ((a >= 97) && (a <= 122) && (b >= 48) && (b <= 57)) {
			System.out.println(name + "님 환영합니다.");
		} else {
			System.out.println("비밀번호는 영어 소문자와 숫자의 조합입니다");
		}

		System.out.println("중간고사 성적을 입력해 주세요");
		int mid = s.nextInt();
		System.out.println("기말고사 성적을 입력해 주세요");
		int last = s.nextInt();

		int c = mid;
		int d = last;

		// 중간고사가 80점 이상이거나 기말고사가 80점 이상이면 "통과" 아니면 "탈락"

		if ((c >= 80) || (d >= 80)) {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}

	}
}
