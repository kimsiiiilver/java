package sec02.exam01;

public class Truck extends Car {

	int weight; // ���� �뷮
	String trunkSize; // Ʈ��ũ ������
	int maxSpeed; // �ִ�ӵ�

	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}
	
	//�Ű����� int 1��¥�� ���� �޼ҵ�, ����Ÿ�� x
	void maxSpeed(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		super.start();
		System.out.println("Ʈ���� ����մϴ�.");
	}

	@Override
	void stop() {
		super.stop();
		System.out.println("Ʈ���� ����ϴ�.");
	}
	

}
