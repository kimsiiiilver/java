package sec02;

public class Car {

	//인터페이스 타입의 필드
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	// Tire 인터페이스로 자동 변환되었으나
	// 오버라이드된 roll메소드는 가지고 넘어감
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.run();
	
	
	
	}
}
