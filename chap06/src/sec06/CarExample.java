package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Car car = new Car();

		w: while (true) {
			System.out.println("1. ���� ���� | 2. �ӵ� ���� | 3. �ߴ�");
			System.out.println("���ϴ� ���񽺸� �Է��Ͻʽÿ�.");
			int num = s.nextInt();

			switch (num) {
			case 1:
				car.setColor();
				break;

			case 2:
				car.setSpeed();
				break;
				
			case 3:
				System.out.println("�����մϴ�.");
				break w;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}
	}
}
