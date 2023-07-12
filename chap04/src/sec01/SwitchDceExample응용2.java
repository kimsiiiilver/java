package sec01;

import java.util.Scanner;

public class SwitchDceExample응용2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("수험번호를 입력하세요"); //030507B
		String tn = s.next();
		char room = tn.charAt(6);

		switch (room) {
			case 'A':
				System.out.println("시험장소가 201호입니다.");
				break;
			case 'B':
				System.out.println("시험장소가 202호입니다.");
				break;
			default:
				System.out.println("시험장소가 203호입니다.");
		}
	}
}
