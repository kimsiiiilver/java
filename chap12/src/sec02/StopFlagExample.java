package sec02;

public class StopFlagExample {

	public static void main(String[] args) {
		
		printThread1 printThread = new printThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println("���ͷ�Ʈ ������ �߻��߽��ϴ�.");
		}
		printThread.setStop(true);

	}

}
