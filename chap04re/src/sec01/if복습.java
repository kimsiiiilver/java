package sec01;

import java.util.Scanner;

public class if복습 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("출전 가수의 이름은 무엇인가요?");
		String name = s.next();
		System.out.println("가수의 평점은 몇 점인가요?");
		int point = s.nextInt();

		String grade;

		if (point >= 8) {
			grade = "최상급";
		} else if (point >= 5) {
			grade = "중급";
		} else {
			grade = "하급";
		}

		System.out.println(name + "님의 등급은 " + grade + "입니다.");
	}

}
