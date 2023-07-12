package sec02;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("배열 개수를 알려주세요.");
		int arraynum = s.nextInt();

		int[] num1 = new int[arraynum];
		int sum = 0;
		double avg=0;
		
		for(int i=0; i<arraynum; i++) {
			num1[i]=i+1;
			sum+=num1[i];
			avg=(double)sum/arraynum;
		}
		System.out.println("평균값은 : "+avg + "입니다.");
	}

}
