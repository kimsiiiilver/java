package sec01;

public class JavaMan extends Thread {

	@Override
	public void run() {
		for(int i= 0; i<2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("기상합니다.");
				Thread.sleep(1500);
			}catch (Exception e) {
			}
		}
	}

	
}
