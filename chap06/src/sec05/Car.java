package sec05;

public class Car {

	// 필드 선언
	String model;
	int speed;
	
	//기본생성자
	Car(){
		
	}

	// 매개변수 1개 생성자, 기본 생성자 x
	Car(String model) {
		this.model = model;
	}

	// 매개변수 1개 메소드, 리턴값 x
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// 매개변수 없는 메소드, 리턴값x
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");

		}
	}

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		myCar.run();
		
		Car yourCar = new Car("제규어");
		yourCar.speed=60;
		
		yourCar.run();
	}
}
