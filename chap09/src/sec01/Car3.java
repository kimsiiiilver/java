package sec01;

public class Car3 {

	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	String color; // ����

	Car3() { // �⺻ ������

	}

	public Car3(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	public void speedUp(int speed) { // �Ű����� 1�� ����x �޼ҵ�
		this.speed += speed;
	}

	void OldSpeed() {
		// Car Ŭ���� ���ο����� OldCar��ü �ٷ� ���� ������
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
	// ���� Ŭ������ ���� Ŭ������ ��ü �������� �ʰ� �ٷ� ��ü ���� ������

	Car3.OldCar2 old = new Car3.OldCar2();
}
