package sec04;

public class SuperCar {

	int speed;

	int getSpeed() { // ���� �ӵ��� ���Ͻ�Ű�� �޼ҵ�
		return speed;
	}

	void keyTurnOn() { // �õ��Ŵ� �޼ҵ�, ����x
		System.out.println("Ű�� �����ϴ�.");
	}

	void run() {
		for (int i = 0; i <= 50; i += 10) { // 0���� 50���� 10�� ����, 6�� �ݺ��Ͽ� ���� �ӵ� ���, ����x
			speed = i;
			System.out.println("�޸��ϴ�.(�ü� " + speed + "km/h)");
		}
	}

}
