package sec01;

public class Car {

	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	static String color; // 색상

	Car() { // 기본 생성자
		System.out.println("Car 호출");
	}

	public Car(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	public void speedUp(int speed) { // 매개변수 1개 리턴x 메소드
		this.speed += speed;
	}

	void stop() {
		System.out.println("Car 멈춤");
	}
	static void stop2() {
		System.out.println("Car 멈춤");
	}

	void OldSpeed() {
		// Car 클래스 내부에서는 OldCar객체 바로 생성 가능함
		OldCar old = new OldCar();
		old.speed = 50;
	}

	class OldCar { // 중첩 클래스(인스턴스 멤버 클래스)
		OldCar() {
			System.out.println("OldCar 호출");
		}

		int speed;
		int cost;

		void speedUp(int speed) { // 매개변수 1개 리턴x 메소드
			this.speed += speed;
		}

		void carCall() {
			// 인스턴스 내부 클래스의 메소드에서
			// 바깥 클래스의 필드와 메소드 접근 가능함(정적x)
			company = "현대";
			stop();
			stop2();
		}
	}

	public static class Truck {

		Truck() {
			System.out.println("Truck 호출");
		}

		int cost;
		int speed;

		void speedUp(int speed) { // 매개변수 1개 리턴x 메소드
			this.speed += speed;
		}

		void speedDown(int speed) { // 매개변수 1개 리턴x 메소드
			this.speed -= speed;
		}

		void carCall() {
			// 정적 클래스의 메소드에서
			// 바깥 클래스의 필드와 메소드 접근 불가
			// company = "현대";
			// stop();
			color="빨강";
			stop2();
		}
	}
}