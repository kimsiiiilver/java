package sec03;

public class Car {

	String company;
	String color;
	String model;
	int maxSpeed;
	int speed;

	public Car() { // �⺻ �����ڸ� ���� ����

	}

	public Car(String model, int speed) { // �����ڸ� �ϳ��� �����
		// ��ǻ�Ͱ� �ڵ����� ������ ����
		this.model = model;
		this.speed =speed;
	}

	public Car(String model, String color, int maxSpeed) { // �����ڸ� �ϳ��� �����
											// ��ǻ�Ͱ� �ڵ����� ������ ����
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.color = color;

	}
}
