package sec02;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	for (int i = 0; i < 10; i++) {
		toolkit.beep();
		try {
			Thread.sleep(3000);
			System.out.println("��");
		}catch (Exception e) {
			System.out.println("���ͷ�Ʈ ������ �߻���");
		}
	}
	}

}
