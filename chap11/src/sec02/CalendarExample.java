package sec02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("���� �ð� : "+hour+"�� " +min+"��");
		
		int ampm = now.get(Calendar.AM_PM);
		
		System.out.println(ampm);
	}

}
