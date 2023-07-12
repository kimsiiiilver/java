package sec02;

import java.util.Scanner;

import sec01.switch연습1;

public class 확인문제5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// 잔고 balance, 예금 deposit, 출금 withdraw
		System.out.println("광주은행에 방문하신 것을 환영합니다.");
		int balance = 0; // 통장 잔고 0으로 설정
		int deposit, withdraw;
		boolean run = true;

		while (run) {
			System.out.println("예금은 1번, 출금은 2번, 잔고확인은 3번, 종료는 4번입니다. ");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("입금 금액이 얼마입니까?");
				deposit = s.nextInt();
				balance += deposit;
				System.out.println("현재 금액은 " + balance + "원 입니다.");
				break;
			case 2:
				System.out.println("출금 금액이 얼마입니까?");
				withdraw = s.nextInt();
				if (balance < withdraw) {
					System.out.println("고객님 잔액이 부족합니다.");
				} else {
					balance -= withdraw;
					System.out.println("남은 금액은 " + balance + "원 입니다.");
				}
				break;
			case 3:
				System.out.println("고객님의 통장 잔액은 " + balance + "원입니다.");
				break;
			default:
				System.out.println("종료합니다.");
				run = false;

			}
		}
	}
}
