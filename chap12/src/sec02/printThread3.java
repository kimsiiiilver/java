package sec02;

public class printThread3 extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("���� ��");

			if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");

	}

}
