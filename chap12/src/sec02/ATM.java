package sec02;

public class ATM extends Thread {

	private int money = 10000;

	public int getMoney() {
		return money;
	}

	@Override
	public void run() {
		while (true) {
			try {
				wait();
				Thread.sleep(500);
			} catch (Exception e) {
			}
			if (zero(1000)) {
				break;
			}

		}
	}

	public synchronized boolean zero(int money) {
		if (this.money - money >= 0) {
			this.money -= money;
			System.out.printf(Thread.currentThread().getName() + ",ÀÜ¾× : %,d¿ø \n", this.money);
			return false;
		} else {
			return true;
		}
	}

}
