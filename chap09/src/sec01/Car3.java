package sec01;

public class Car3 {

	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	String color; // 색상

	Car3() { // 기본 생성자

	}

	public Car3(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	public void speedUp(int speed) { // 매개변수 1개 리턴x 메소드
		this.speed += speed;
	}

	void OldSpeed() {
		// Car 클래스 내부에서는 OldCar객체 바로 생성 가능함
		OldCar2 old = new OldCar2();
		old.speed = 50;
	}

	public static class OldCar2 {
		int speed;
		int cost;

		void speedUp(int speed) {
			this.speed += speed;
		}
	}
}

class Car4 {
	// 정적 클래스는 상위 클래스의 객체 생성하지 않고 바로 객체 생성 가능함

	Car3.OldCar2 old = new Car3.OldCar2();
}
