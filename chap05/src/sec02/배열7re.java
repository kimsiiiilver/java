package sec02;

import java.util.Scanner;

public class �迭7re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�迭�� ������ �Է��ϼ���.");

		int scores = s.nextInt();
		int n[] = new int[scores];

		int sum = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���.");
			n[i] = s.nextInt();
			sum+=n[i];
		}
		System.out.println("���� : " + sum);

		double avg = (double) sum / scores;
		System.out.println("��� : " + avg);
	}

}
