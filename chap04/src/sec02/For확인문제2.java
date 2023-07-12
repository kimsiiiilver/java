package sec02;

import java.util.Scanner;

public class For확인문제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력1 : ");
		int a = s.nextInt();
		System.out.print("정수 입력2 : ");
		int b= s.nextInt();
		
		int sum = 0;
		for (int i=a; i<b; i++) {
			sum += i;
			System.out.print(i+ "+");
		}
		sum += b;
		System.out.print(b+"="+sum);
	}

}
