package sec03;

import java.util.Calendar;

public class ����������1 {

	public static void main(String[] args) {
		Part Month = null;

		Calendar cal = Calendar.getInstance();
		int m = cal.get(Calendar.MONTH) + 1;

		switch (m) {
		case 1:
		case 2:
		case 3:
			Month = Part.�ϻ�б�;
			break;
		case 4:
		case 5:
		case 6:
			Month = Part.�̻�б�;
			break;
		case 7:
		case 8:
		case 9:
			Month = Part.���б�;
			break;
		default:
			Month = Part.���б�;

		}
		System.out.println("���� ���� " + Month + "�Դϴ�.");

	}

}
