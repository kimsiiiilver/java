package sec02;

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] weather = new String[4];
		weather[0] = "봄";
		weather[1] = "여름";
		weather[2] = "가을";
		weather[3] = "겨울";

		System.out.println("좋아하는 계절을 입력하세요.");

		boolean repeat = true;
		while (repeat) {
			System.out.println("1.봄 | 2.여름| 3.가을| 4.겨울");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println(weather[0] + "을 선택하셨습니다.");
				repeat = false;
				break;
			case 2:
				System.out.println(weather[1] + "을 선택하셨습니다.");
				repeat = false;
				break;
			case 3:
				System.out.println(weather[2] + "을 선택하셨습니다.");
				repeat = false;
				break;
			case 4:
				System.out.println(weather[3] + "을 선택하셨습니다.");
				repeat = false;
				break;
			}
			System.out.println("다시 선택하세요");
		}

	}

}
