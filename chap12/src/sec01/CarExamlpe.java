package sec01;

public class CarExamlpe {

	public static void main(String[] args) {
		System.out.println("���� ����մϴ�.");

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 4; i++) {
					try {
						Thread.sleep(500);
						System.out.println("���� �ӵ� "+50*i+"km");
					} catch (Exception e) {

					}
				}
			}
		});

		thread.start();
		for (int i = 1; i <= 4; i++) {
			try {
				thread.sleep(500);
				System.out.print("�ӵ��� �ø��ϴ�.");
			} catch (Exception e) {
			}
		}
		
		try {
			thread.sleep(500);
			System.out.print("���� ����ϴ�.");
		} catch (Exception e) {
		}

	}

}
