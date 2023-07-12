package sec02;

import java.util.Scanner;

public class 확인문제9re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		String a = s.next();
		System.out.println("두 번째 수를 입력하세요");
		String b = s.next();
		
		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);
		double result = c/d;
		
		if(d==0|d==0.1) {
			System.out.println("결과 "+" 무한대");
		} else {
			System.out.println("결과 " +result);
		}
		

	}

}
