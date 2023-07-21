package sec02;

public class Remote {

	// �͸� ���� ��ü ����
	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");

		}

	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};

		// �͸� ���� ��ü ���� �޼ҵ��
		// �ܺ� �޼ҵ忡�� �ݵ�� ȣ������� ��
		localVar.turnOn();
		localVar.turnOff();

	}

	// �Ű������� �͸� ���� ��ü�� ����ϴ� �޼ҵ�
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

	public static void main(String[] args) {
		Remote rm = new Remote();
		rm.rc.turnOn(); // �͸� ��ü �ʵ� ���
		rm.method1(); // �͸� ���� ��ü �޼ҵ� ���� ���� ���� ���

		// �Ű� ������ �͸� ���� ��ü ���
		rm.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("����ƮTV�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("����ƮTV�� ���ϴ�.");
			}
		});

	}
}
