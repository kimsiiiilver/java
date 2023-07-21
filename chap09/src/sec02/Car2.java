package sec02;

public class Car2 {
	

	Car truck = new Car() {

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("�ӵ��� �ö󰩴ϴ�. " + this.speed);
		}

		@Override
		void stop() {
			System.out.println("Car2�� ����ϴ�.");
			speedUp(10);
			speedUp(50);
		}
	};

	// ���� �͸� ��ü ����
	void speedDown() {
		Car downCar = new Car() {

			@Override
			void stop() {
				this.speed -= 20;
				System.out.println("�ӵ��� �������ϴ�." + this.speed);
			}
		};
		
		//speedDown() �޼ҵ带 ȣ���ϸ� �͸� ��ü���� �޼ҵ尡 �ڵ����� ������� ����
		downCar.stop();
	}
}
