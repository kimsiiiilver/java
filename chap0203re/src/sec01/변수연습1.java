package sec01;

import java.util.Scanner;

public class 변수연습1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요.");
		int num1 = s.nextInt();
		
		int num2 = 5;
		
		System.out.println("입력하신 숫자와 num2의 합계는 : " +(num1+num2)+"입니다.") ;
	}

}
