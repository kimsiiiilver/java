package sec02.exam01;

public class Car {
	String color; // �ڵ��� ����
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����

	// �Ű����� 2���� ������, �⺻ ������ x

	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}

	// �Ű����� int 1��¥�� �޼ҵ�� ����Ÿ�� x �Ű������� ���ڸ�ŭ ���ǵ� ����
	void speedUp(int speed) {
		this.speed += speed;
	}

	// �Ű������� ���ڸ�ŭ ���ǵ� ����
	void speedDown(int speed) {
		this.speed -= speed;
	}

	// �Ű����� x, ����Ÿ�� x
	void start() {
		System.out.println("�õ��� �ɾ����ϴ�");
	}

	// �Ű����� x, ����Ÿ�� x
	void stop() {
		System.out.println("���� ����ϴ�.");
	}

}
