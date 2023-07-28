package sec01;

import java.util.Calendar;

public class 자바맨의_일상 {

	public static void main(String[] args) {
		System.out.println("자바맨의 일상");

		Calendar now = Calendar.getInstance();



		Thread tr1 = new JavaMan();
		Thread tr2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("공부합니다.");
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		});
		Thread tr3 = new Thread(new JavaManRunnable());

		tr1.start();
		tr2.start();
		tr3.start();
		
		for(int i=0; i<2; i++) {
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH) + 1;
			int day = now.get(Calendar.DATE);
			System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", year, month, day);
			try {
				Thread.sleep(2000);
			}catch (Exception e) {
			}
			now.add(Calendar.DATE, 1);
			
		}

	}

}
