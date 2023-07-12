package sec01;

import java.util.Scanner;

public class switch복습1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("출전 가수의 이름은 무엇인가요?");
		String name = s.next();
		System.out.println("가수의 평점은 몇 점인가요?");
		int point = s.nextInt();

		String grade;

		switch (point) {
		case 10:
		case 9:
		case 8:
			grade = "최상급";
			break;
		case 7:
		case 6:
		case 5:
			grade = "중급";
			break;
		default:
			grade = "하급";
		}
		System.out.printf("%s님의 평점은 %s입니다.",name,grade);
	}

}
