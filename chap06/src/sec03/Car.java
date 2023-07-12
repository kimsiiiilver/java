package sec03;

public class Car {

	String company;
	String color;
	String model;
	int maxSpeed;
	int speed;

	public Car() { // 기본 생성자를 제일 위로

	}

	public Car(String model, int speed) { // 생성자를 하나라도 만들면
		// 컴퓨터가 자동으로 만들지 않음
		this.model = model;
		this.speed =speed;
	}

	public Car(String model, String color, int maxSpeed) { // 생성자를 하나라도 만들면
											// 컴퓨터가 자동으로 만들지 않음
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.color = color;

	}
}
