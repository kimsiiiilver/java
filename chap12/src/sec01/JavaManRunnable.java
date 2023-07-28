package sec01;

public class JavaManRunnable implements Runnable {

	@Override
	public void run() {

		for(int i=0; i<2; i++) {
			try {
				Thread.sleep(1500);
				System.out.println("잠을 잡니다.");
				Thread.sleep(500);
			}catch (Exception e) {
			}
		}
	}

	
}
