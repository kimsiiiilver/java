package sec02;

import java.util.Scanner;

public class 다차원배열문제1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] name = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요.");
			name[i]=s.next();
		}

		int[][] num = new int[3][2];
		double a[] = new double[3];
		
		for (int j = 0; j <num.length; j++) {			// 3
			for (int k = 0; k<num[j].length; k++) {		// 2

				if(k==0) {
					System.out.println(name[j]+"의 중간점수를 입력하세요.");
				} else {
					System.out.println(name[j]+"의 기말점수를 입력하세요.");
				}
				num[j][k] = s.nextInt();
			}
			int sum = num[j][0]+num[j][1];
			a[j] = (double)sum/2;
		}
		for(int i=0; i<3; i++) {
			System.out.println(name[i] +"의 평균점수는 "+a[i]+"입니다.");
		}
	}
}
