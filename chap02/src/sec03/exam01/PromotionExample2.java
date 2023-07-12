package sec03.exam01;

import java.util.Scanner;


public class PromotionExample2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //s는 키보드로 친 내용 출력(?)
		System.out.println("출신 학교를 입력하세요. 예) 00중, 00고");
		String a = s.next(); // next 문자열로 받는 것
		char b = a.charAt(2);
		
		if(b=='중') {
			System.out.println("당신은 중학생입니다.");
		} else {
			System.out.println("당신은 고등학생입니다.");
		}
		
		
		
		
		
		
		
		
	}

}