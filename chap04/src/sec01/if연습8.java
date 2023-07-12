package sec01;

import java.util.Scanner;

public class if연습8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int num1 = s.nextInt();
		System.out.print("수학 점수 : ");
		int num2 = s.nextInt();
		System.out.print("영어 점수 : ");
		int num3 = s.nextInt();

		int sum = num1 + num2 + num3;

        //1
		if (num1 > 6 && num2 > 6 && num3 > 6 && sum >= 30) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}

        //2		
		if (num1 <= 6 || num2 <= 6 || num3 <= 6 || sum < 30) {
			System.out.println("불합격입니다!");
		} else {
			System.out.println("합격입니다!");
		}
	}

}
