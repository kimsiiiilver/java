package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class ����̿�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = s.next();
		
		System.out.print("�̿��Ͻ� �׸��� �Է��ϼ���.\n"
				+ "ĿƮ(8.0)||�ĸ�(20.0)||����(25.0)||����(60.0)\n");
		String choice = s.next();
		
		int cost = 0;
		
		switch(choice) {
		case "ĿƮ" :
			cost = 8000;
			break;
		case "�ĸ�" :
			cost = 20000;
			break;
		case "����" :
			cost = 25000;
			break;
		case "����" :
			cost = 60000;
			break;
		}

		
		Calendar now = Calendar.getInstance();
		int ampm = now.get(Calendar.AM_PM);
		int time = now.get(Calendar.HOUR);
		
		if(ampm==0) {
			cost*=0.7;
		} else if(time<6) {
			cost*=0.9;
		}

		System.out.println(name+"���� �����ݾ��� "+cost+"�� �Դϴ�.");
	}

}
