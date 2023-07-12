package sec05;

import java.util.Scanner;

public class 확인문제3re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int a = s.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println("뺄셈 결과 : " + (a-b));
		} else {
			System.out.println("덧셈 결과 : "+ (a+b));
		}
		}

	}


