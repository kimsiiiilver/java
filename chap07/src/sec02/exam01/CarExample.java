package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("�����","BMW",3,"��");
		
		Car car = truck; // �ڵ� Ÿ�� ��ȯ

		car.speedUp(30); //�θ� �޼ҵ� ȣ��
		// car.maxSpeed(50);     Ÿ�� ��ȯ���� �ڽ� �޼ҵ� ȣ�� �Ұ� 
		
		car.start(); //�ڽ� �޼ҵ������� �������̵��߱� ������ ȣ�� ����
	
	}

}
