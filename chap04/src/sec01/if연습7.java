package sec01;

import java.util.Scanner;

public class if연습7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("상품 수량 : ");
		int num = s.nextInt();

		float price;

		if (num >= 8) {
			price = 7000 * num * 0.9f; //num * 6300( 애초에 할인가로 입력)
		} else {
			price = 7000 * num;
		}
		System.out.printf("가격은 %.0f원 입니다.", price);
	}

}
