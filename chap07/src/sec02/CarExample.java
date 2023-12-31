package sec02;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성
		// car 객체는 Car 클래스의 필드, 메소드 사용 가능함

		for (int i = 1; i <= 5; i++) { // 5번 반복
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire(15, "앞 왼쪽");
				break;
			case 2:
				System.out.println("앞 왼쪽 금호타이어로 교체");
				car.frontLeftTire = new HankookTire(13, "앞 오른쪽");
				break;
			case 3:
				System.out.println("앞 왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire(14, "뒤 왼쪽");
				break;
			case 4:
				System.out.println("앞 왼쪽 금호타이어로 교체");
				car.frontLeftTire = new HankookTire(17, "뒤 오른쪽");
				break;
			}
		}

	}

}
