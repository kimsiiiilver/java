package sec05;

import java.util.Scanner;

public class 확인문제2re {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 수:");
		String strNum1 = s.next();
		System.out.print("두번째 수:");
		String strNum2 = s.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		
		
		
	}

}
