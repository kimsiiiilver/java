package sec04;

public class KyecodeExample1 {

	public static void main(String[] args) throws Exception {

		// throws Exception �� ���� ��Ȳ�� ȭ�鿡 �����

		int keyCde;

		while (true) {
			keyCde = System.in.read();
			System.out.println("Ű�ڵ� : " + keyCde);

			if (keyCde == 113) {break;}
			
		}
		System.out.println("����");

	}

}
