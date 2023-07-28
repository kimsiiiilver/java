package sec02;

public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new printThread2();
		thread.start();
		
		
		try {
			Thread.sleep(10);
		}catch (Exception e) {
		}

		
		thread.interrupt();
		

	}

}
