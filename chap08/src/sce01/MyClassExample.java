package sce01;

public class MyClassExample {

	public static void main(String[] args) {

		MyClass my1 = new MyClass();
		// ����Ʈ ������ ȣ��

		my1.rc.turnOn();
		my1.rc.setVolume(7);

		MyClass my2 = new MyClass(new Television());
		my1.rc.turnOn();
		my1.rc.setVolume(7);
		
		MyClass my3 = new MyClass(new Audio());
		//�ư����� 1�� ������ ȣ��
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		
		MyClass my4 = new MyClass();
		my4.methodA();
		//�Ű������� ���� �޼ҵ� ȣ��(Audio ȣ��)

		MyClass my5 = new MyClass();
		my5.methodB(new Television());
		//�Ű������� �ִ� �޼ҵ� ȣ�� (Television ȣ��)
				
	
	}

}
