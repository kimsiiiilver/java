package sec02;

public class PersonExample {

	public static void main(String[] args) {

		StudentA.StudentB stB = new StudentA().new StudentB();

		stB.name = "¯��";
		stB.age = 15;
		stB.sleep();

		StudentA sta = new StudentA();

		sta.person.wake();
		// sta.person.work(); �������̵� �� �� �޼ҵ�� ���� ȣ�� �Ұ�
		sta.method1();

		// merhod2�� �Ű������� Person Ŭ���� Ÿ���� �Ѱ���� ��
		// �Ű������� �������� ; ��� ����
		sta.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}

				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
					//�������̵� �ȵ� �޼ҵ�� �ٷ� ȣ�� �Ұ��� �������� �޼ҵ� ȣ��
				}
			}
		);

	}

}
