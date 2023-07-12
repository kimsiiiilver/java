package sec01;

import java.util.Scanner;

public class if연습7re {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("상품 수량 : ");
		int num = s.nextInt();

		int price;

		if (num >= 8) {
			price = (int) (7000 * 0.9) * num;
		} else {
			price = 7000*num;
		}
		System.out.println("가격은 " + price + "원 입니다.");
				
	}
}
