package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class 전대미용실 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = s.next();
		
		System.out.print("이용하실 항목을 입력하세요.\n"
				+ "커트(8.0)||파마(20.0)||염색(25.0)||매직(60.0)\n");
		String choice = s.next();
		
		int cost = 0;
		
		switch(choice) {
		case "커트" :
			cost = 8000;
			break;
		case "파마" :
			cost = 20000;
			break;
		case "염색" :
			cost = 25000;
			break;
		case "매직" :
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

		System.out.println(name+"님의 결제금액은 "+cost+"원 입니다.");
	}

}
