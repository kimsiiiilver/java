package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Car car = new Car();

		w: while (true) {
			System.out.println("1. 색상 변경 | 2. 속도 변경 | 3. 중단");
			System.out.println("원하는 서비스를 입력하십시오.");
			int num = s.nextInt();

			switch (num) {
			case 1:
				car.setColor();
				break;

			case 2:
				car.setSpeed();
				break;
				
			case 3:
				System.out.println("종료합니다.");
				break w;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}
}
