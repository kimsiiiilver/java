package sec04;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Travel travel = new Travel();

		travel.setOil(20);
		travel.setLocation("����");

		Scanner s = new Scanner(System.in);

		while (travel.isOilLeft()) {
			System.out.println("�������� �Է��ϼ���.");
			String location1 = s.next();

			travel.setLocation(location1);

			if (location1.equals("����")) {
				travel.oilMinus(10);
			}
			if (location1.equals("�λ�")) {
				travel.oilMinus(5);
			}
			if (location1.equals("ȭ��")) {
				travel.oilMinus(2);
			}
			System.out.printf("���� ��ġ�� %s �Դϴ�.\n", location1);

		}

	}

}
