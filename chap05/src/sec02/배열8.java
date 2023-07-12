package sec02;

import java.util.Scanner;

public class 배열8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] lotto = new int[6];
		
		int sum=0;
		
		System.out.println("로또 몇 게임을 하시겠습니까?");
		int num1 = s.nextInt();
		
		for(int i=0; i<num1; i++) {
			for(int j=0; j<6; j++) {
				
				lotto[j] = (int)(Math.random()*45)+1;
				
				System.out.printf("%2d ",lotto[j]);
			}
			System.out.println();
		}
	}

}
