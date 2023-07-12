	package sec03.exam07;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = s.nextInt();
		
		System.out.println("오만원권 :" + money / 50000 + "개");
		money = money %50000;
		System.out.println("만원권 : " + money / 10000 +"개");
		money = money %10000;
		System.out.println("천원권 : " + money / 1000 +"개");
		money = money %1000;
		System.out.println("백원 : " + money / 100 +"개");
		money = money %100;
		System.out.println("십원 : " + money / 10 +"개");
		money = money %10;
		
		
		
		
	}

}
