package sec02;

public class Anonymous {

	Worker field = new Worker() {

		@Override
		public void start() {
			System.out.println("�������� �մϴ�.");
		}

	};

	void method1() {
		Worker locaVar = new Worker() {

			@Override
			public void start() {
				System.out.println("������ �մϴ�.");
			}
		};
		locaVar.start();
	}

	void method2(Worker worker) {
		worker.start();
	}

}
