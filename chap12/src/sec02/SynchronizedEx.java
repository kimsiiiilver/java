package sec02;

public class SynchronizedEx {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Thread mama = new Thread(atm, "����");
		Thread son =new Thread(atm, "�Ƶ�");
		
		mama.start();
		son.start();

	}

}
