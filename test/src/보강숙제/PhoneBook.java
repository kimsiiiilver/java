package 보강숙제;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		
		int p = s.nextInt();
		
		Phon[] phone = new Phon[p];
		
		for(int i=0; i<p; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) : ");
			phone[i]=new Phon(s.next(), s.next());
		}
		System.out.println("저장되었습니다.");
		
		while(true) {
			boolean ac = true;
			System.out.print("검색할 이름 : ");
			String pp = s.next();
			
			if(pp.equals("중지")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			for(int i=0; i<p; i++) {
				if(pp.equals(phone[i].name)) {
					System.out.println(phone[i].name+"의 전화번호는 "+phone[i].phoneNumber+"입니다.");
					ac=false;
				}
			}
			if (ac) {
				System.out.println(pp+"이 없습니다.");
			}
		}
	}

}
