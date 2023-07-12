package sec02;

import java.util.Scanner;

public class 로또if중복제거 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		int[] lotto = new int[6];
		boolean[] check = new boolean[46];


		System.out.println("로또 몇 게임을 하시겠습니까?");
		int num1 = s.nextInt();

		for (int i = 0; i < num1; i++) {
	
			for (int j = 0; j < lotto.length; j++) {
				num = (int) (Math.random() * 45) + 1;
				
				if (check[num] == false) {
					lotto[j]=num;
					check[num]=true;
				}else {
					j--;
					continue;
				}
				System.out.printf("%2d ", lotto[j]);
			}
			System.out.println();
		}
	}

}
