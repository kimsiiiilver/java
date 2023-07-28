package sec01;

public class CarExamlpe {

	public static void main(String[] args) {
		System.out.println("차가 출발합니다.");

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 4; i++) {
					try {
						Thread.sleep(500);
						System.out.println("현재 속도 "+50*i+"km");
					} catch (Exception e) {

					}
				}
			}
		});

		thread.start();
		for (int i = 1; i <= 4; i++) {
			try {
				thread.sleep(500);
				System.out.print("속도를 올립니다.");
			} catch (Exception e) {
			}
		}
		
		try {
			thread.sleep(500);
			System.out.print("차를 멈춥니다.");
		} catch (Exception e) {
		}

	}

}
