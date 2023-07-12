package sec02;

import java.util.Scanner;

public class 스무고개 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요(1~20) : ");

		int comNum = (int) (Math.random() * 20) + 1;

		while (true) {
			int userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("정답입니다.");
				break;
			} else if (userNum > comNum) {
				System.out.println("숫자를 다시 입력하세요(Down)");
			} else {
				System.out.println("숫자를 다시 입력하세요(up)");
			}
			
		}

	}

}
