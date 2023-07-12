package sec02;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int st = s.nextInt();
		System.out.println("연필 갯수를 입력하세요");
		int p = s.nextInt();
		
		int a = p/st;
		int b = p % st;
		System.out.println("학생 한 명당 " + a + "개씩 연필을 가져가고 " + b + "개가 남아요");
		

		

	}

}
