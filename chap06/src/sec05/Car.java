package sec05;

public class Car {

	// �ʵ� ����
	String model;
	int speed;
	
	//�⺻������
	Car(){
		
	}

	// �Ű����� 1�� ������, �⺻ ������ x
	Car(String model) {
		this.model = model;
	}

	// �Ű����� 1�� �޼ҵ�, ���ϰ� x
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// �Ű����� ���� �޼ҵ�, ���ϰ�x
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü� : " + this.speed + "km/h)");

		}
	}

	public static void main(String[] args) {
		Car myCar = new Car("������");
		myCar.run();
		
		Car yourCar = new Car("���Ծ�");
		yourCar.speed=60;
		
		yourCar.run();
	}
}
