package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {

		Phone p = new SmartPhone();
		// �ڽ� ��ü�� �θ� ��ü�� Ÿ�� ��ȯ ��Ŵ(�ڵ���ȯ)

		System.out.println(p.cost);
		p.ring();
		p.powerOn(); // �������̵� �޼ҵ�ȣ��
		// p.videoOn(); �ڽ� Ŭ���� �޼ҵ� ȣ�� �Ұ�
		// p.phoneCase="�ϵ����̽�"; �ڽ� Ŭ���� �ʵ� ��� �Ұ�

		SmartPhone sp = (SmartPhone)p;
		//�θ� ��ü�� �ڽ� ��ü�� ���� Ÿ�� ��ȯ ��Ŵ
		
		sp.phoneCase="����Ʈ���̽�";  //�ڽ� ��ü �ʵ峪 �޼ҵ� ��� ����
		sp.powerOn();
		sp.videoOn();  //�θ� ��ü �޼ҵ� ��� ����
		System.out.println(sp.cost);  // ���� �̸��� �ʵ�� �ڽ� ��ü ���

		//Phone p2 = new Phone();
		//SmartPhone sp2 = (SmartPhone)p2;
		//�ڽ� Ÿ���� �θ� Ÿ������ ��ȯ���� ���� ���¿��� 
		//�θ�Ÿ���� �ڽ� Ÿ������ ���� ��ȯ�� ���� ����
		
		
	}

}
