package sec01;

public class JavaManRunnable implements Runnable {

	@Override
	public void run() {

		for(int i=0; i<2; i++) {
			try {
				Thread.sleep(1500);
				System.out.println("���� ��ϴ�.");
				Thread.sleep(500);
			}catch (Exception e) {
			}
		}
	}

	
}
