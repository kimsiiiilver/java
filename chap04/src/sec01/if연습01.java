package sec01;

import java.util.Scanner;

public class if연습01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("0~100까지 숫자를 하나 입력하세요.");
		int a = s.nextInt();

		System.out.println("a의 값은 : " + a);
		if (a >= 90) {
			System.out.println("a는 90이상 입니다.");
		} else if (a >= 80) {
			System.out.println("a는 80이상 입니다.");
		} else if (a >= 70) {
			System.out.println("a는 70이상 입니다.");
		} else if (a >= 80) {
			System.out.println("a는 60이상 입니다.");
		} else {
			System.out.println("a는 50이하 입니다.");

}

	}

}
