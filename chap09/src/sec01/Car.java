package sec01;

public class Car {

	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	static String color; // ����

	Car() { // �⺻ ������
		System.out.println("Car ȣ��");
	}

	public Car(String company, int cost) {
		this.company = company;
		this.cost = cost;
	}

	public void speedUp(int speed) { // �Ű����� 1�� ����x �޼ҵ�
		this.speed += speed;
	}

	void stop() {
		System.out.println("Car ����");
	}
	static void stop2() {
		System.out.println("Car ����");
	}

	void OldSpeed() {
		// Car Ŭ���� ���ο����� OldCar��ü �ٷ� ���� ������
		OldCar old = new OldCar();
		old.speed = 50;
	}

	class OldCar { // ��ø Ŭ����(�ν��Ͻ� ��� Ŭ����)
		OldCar() {
			System.out.println("OldCar ȣ��");
		}

		int speed;
		int cost;

		void speedUp(int speed) { // �Ű����� 1�� ����x �޼ҵ�
			this.speed += speed;
		}

		void carCall() {
			// �ν��Ͻ� ���� Ŭ������ �޼ҵ忡��
			// �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������(����x)
			company = "����";
			stop();
			stop2();
		}
	}

	public static class Truck {

		Truck() {
			System.out.println("Truck ȣ��");
		}

		int cost;
		int speed;

		void speedUp(int speed) { // �Ű����� 1�� ����x �޼ҵ�
			this.speed += speed;
		}

		void speedDown(int speed) { // �Ű����� 1�� ����x �޼ҵ�
			this.speed -= speed;
		}

		void carCall() {
			// ���� Ŭ������ �޼ҵ忡��
			// �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� �Ұ�
			// company = "����";
			// stop();
			color="����";
			stop2();
		}
	}
}