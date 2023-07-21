package sec01;

public class Outter {

	String name = "홍길동";

	void reName() {
		System.out.println("이름 변경합니다.");
	}

	class Nestsd {
		String name = "장동건";

		void reName() {
			System.out.println("이름 변경합니다.");
		}

		void print() {
			System.out.println(this.name);
			System.out.println(Outter.this.name);
		}
	}

}
	