package sec02;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car(); // car ��ü ����
		// car ��ü�� Car Ŭ������ �ʵ�, �޼ҵ� ��� ������

		for (int i = 1; i <= 5; i++) { // 5�� �ݺ�
			int problemLocation = car.run();
		
			switch(problemLocation) {
			case 1:
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire(15, "�� ����");
				break;
			case 2:
				System.out.println("�� ���� ��ȣŸ�̾�� ��ü");
				car.frontLeftTire = new HankookTire(13, "�� ������");
				break;
			case 3:
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire(14, "�� ����");
				break;
			case 4:
				System.out.println("�� ���� ��ȣŸ�̾�� ��ü");
				car.frontLeftTire = new HankookTire(17, "�� ������");
				break;
			}
		}

	}

}
