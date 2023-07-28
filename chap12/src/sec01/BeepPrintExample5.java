package sec01;

import java.awt.Toolkit;

public class BeepPrintExample5 {

	public static void main(String[] args) {

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});
		th.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
}
