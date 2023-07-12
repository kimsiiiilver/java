package sec03;

import java.util.Calendar;

public class 날짜출력연습 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DAY_OF_MONTH);
		int t = cal.get(Calendar.HOUR);
 
		System.out.printf("%d년 %d월 %d일 %d시 입니다.",y,m,d,t);
	}

}



