package sec03;

import java.util.Calendar;

public class ��¥��¿��� {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DAY_OF_MONTH);
		int t = cal.get(Calendar.HOUR);
 
		System.out.printf("%d�� %d�� %d�� %d�� �Դϴ�.",y,m,d,t);
	}

}



