package sec01.exam07;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
	}
	public final void stop() {
		//final �޼ҵ�� �޼ҵ� �������̵� �Ұ�
		System.out.println("���� ����");
		speed=0;
	}

}
