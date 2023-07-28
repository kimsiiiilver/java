package sec02;

public class ThreadExample {

	public static void main(String[] args) {

		Thread thread = new MovieThread();
		thread.start();

		try {
			thread.sleep(1000);
		} catch (Exception e) {
		}
		thread.interrupt();
	}

}
