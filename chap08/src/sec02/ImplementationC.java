package sec02;

public class ImplementationC implements interfaceC {

	public void methodB() {
		System.out.println("�޼ҵ�B ����");
	}

	public void methodA() {
		System.out.println("�޼ҵ�A ����");
	}

	public void methodC() {
		System.out.println("�޼ҵ�C ����");
	}

	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();
		
		interfaceC ic = imple;
		//�������̽�C�� ��ü�� ic�� A�� B�� ��� �޼ҵ� ��� ������
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
