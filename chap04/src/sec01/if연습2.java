package sec01;

import java.util.Scanner;

public class if연습2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = s.nextInt();
		
		if (score>=50) {
			System.out.println("점수 : " + score);
			System.out.println("합격입니다.");
		} else {
			System.out.println("점수 : " + score);
			System.out.println("재시험을 보세요");
		}
		
	}

}
