package sec02;

import java.util.Scanner;

public class 배열7re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("배열의 개수를 입력하세요.");

		int scores = s.nextInt();
		int n[] = new int[scores];

		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			n[i] = s.nextInt();
			sum+=n[i];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores;
		System.out.println("평균 : " + avg);
	}

}
