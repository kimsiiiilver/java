package sec01;

public class Outter {

	String name = "ȫ�浿";

	void reName() {
		System.out.println("�̸� �����մϴ�.");
	}

	class Nestsd {
		String name = "�嵿��";

		void reName() {
			System.out.println("�̸� �����մϴ�.");
		}

		void print() {
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}

}
	