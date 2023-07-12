package sec03;

import java.util.Calendar;

public class 열거형문제1 {

	public static void main(String[] args) {
		Part Month = null;

		Calendar cal = Calendar.getInstance();
		int m = cal.get(Calendar.MONTH) + 1;

		switch (m) {
		case 1:
		case 2:
		case 3:
			Month = Part.일사분기;
			break;
		case 4:
		case 5:
		case 6:
			Month = Part.이사분기;
			break;
		case 7:
		case 8:
		case 9:
			Month = Part.삼사분기;
			break;
		default:
			Month = Part.사사분기;

		}
		System.out.println("현재 월은 " + Month + "입니다.");

	}

}
