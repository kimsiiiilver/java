package sec02;

import java.util.Scanner;

public class 확인문제9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수:");
		double a = Double.parseDouble(s.next());
		System.out.println("두 번째 수:");
		double b = Double.parseDouble(s.next());
		
		
		
		System.out.println("--------------------------");
		if(b !=0.0) {
			System.out.println("결과 "+ (a/b));
		} else {
			System.out.println("결과 + 무한대");
		}
		

	}

}
