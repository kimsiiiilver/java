package sec01;

import java.util.Scanner;

public class switch복습2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("학과 코드를 무엇인가요?");
		String code = s.next();
		// a 법학과 b 경영학과 c국문학과
		// a123->법학과 학생입니다.

		String student;

		switch (code.charAt(0)) {
		case 'A':
			student = "법학과";
			break;
		case 'B':
			student = "경영학과";
			break;
		default:
			student = "국문학과";
		}
		System.out.printf("%s 학생입니다.",student);

	}

}
