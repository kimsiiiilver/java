package sec03;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("ȫ�浿");
		//�߻� Ŭ������ ���� ��ü ���� �Ұ�
		
		SmartPhone sp = new SmartPhone("ȫ�浿", 1200000);
		
		sp.turnOn();  //�߻�Ŭ������ �޼ҵ� 
		sp.internetSearch();   //��ü �޼ҵ�
	}

}
