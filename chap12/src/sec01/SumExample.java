package sec01;

public class SumExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					if (i % 2 == 1) {
						System.out.println(i);
						try {
							Thread.sleep(500);
						} catch (Exception e) {
						}
					}
				}

			}
		});

		// 1부터 10까지 홀수만 출력

		// 1부터 10까지 짝수만 출력

		thread.start();
		 
		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				try {
					Thread.sleep(250);
					System.out.println(j);
					Thread.sleep(250);
				} catch (Exception e) {
				}
			}
		}
	}

}
