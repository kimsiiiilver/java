package sec01;

import java.util.Scanner;

public class IfElse응용1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("중간고사 성적은?");
		int mid = s.nextInt();
		System.out.println("기말고사 성적은?");
		int last = s.nextInt();

		/*
		 * 중간고사와 기말고사 평균 점수가 90점 이상이면 "a학점" 중간고사와 기말고사 평균점수가 80점 이상이면 "b학점" 나머지는
		 * "c학점"이되, 어느 한 과목이라도 60미만이면 "재수강"
		 */

		int a = (mid + last) / 2;
		if (mid < 60 || last < 60) {
			System.out.println("재수강");
		} else if (a >= 90) {
			System.out.println("A학점");
		} else if (a >= 80) {
			System.out.println("B학점");
		} else {
			System.out.println("C학점");
		}
	}

}
