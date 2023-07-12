package sec02.exam04;

import java.util.Scanner;

public class 응용문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇층인가요?");
		int a = s.nextInt();
		int b = a * 5;
		int c = b / 3;

		System.out.println("입력하신 건물은 전체 " + b + "m이고 최대거주인원은 "+ c +"명입니다.");

	}

}
