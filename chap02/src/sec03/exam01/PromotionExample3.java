package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //s는 키보드로 친 내용 출력(?)
		System.out.println("한 글자를 입력하세요");
		String a = s.next(); // next 문자열로 받는 것
		char b = a.charAt(0); //'0'은 글자의 수 - string -> char로 변환, charAt(숫자) 문자열에서 해당 숫자 위치에 해당하는 문자열을 char타입으로 변환
		int c = b; // char -> int로 변환
		
	
		System.out.println("입력하신 "+ a + "의 유니코드 값은" + c + "입니다");
	 
		//toString(데이터) 데이터를 string 타입으로 변환
		
		
		
	}

}