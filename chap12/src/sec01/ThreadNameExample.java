package sec01;

public class ThreadNameExample {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("�⺻ ������ �̸� : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("ù��° �۾� ������ �̸� : "+threadA.getName());
		
		threadA.start();
		
		//ThreadB threadB = new ThreadB();
		//System.out.println("�ι�° �۾� ������ �̸� : "+threadB.getName());
	}

}
