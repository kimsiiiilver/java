package sec01;

import java.util.Scanner;

public class 변수연습5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇학년 인가요?");
		String grade = s.next();

		int a = Integer.parseInt(grade);
		System.out.println("당신은 내년에 "+(a+1)+"학년입니다.");
	}

}
