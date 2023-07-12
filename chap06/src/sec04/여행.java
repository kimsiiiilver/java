package sec04;

import java.util.Scanner;

public class 여행 {

	public static void main(String[] args) {
		Travel travel = new Travel();

		travel.setOil(20);
		travel.setLocation("광주");

		Scanner s = new Scanner(System.in);

		while (travel.isOilLeft()) {
			System.out.println("여행지를 입력하세요.");
			String location1 = s.next();

			travel.setLocation(location1);

			if (location1.equals("서울")) {
				travel.oilMinus(10);
			}
			if (location1.equals("부산")) {
				travel.oilMinus(5);
			}
			if (location1.equals("화순")) {
				travel.oilMinus(2);
			}
			System.out.printf("현재 위치는 %s 입니다.\n", location1);

		}

	}

}
