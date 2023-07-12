package sec02;

import java.util.Scanner;

public class 로그인 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String cid = "abc";
		int cpass = 1234;
		
		while(true) {
			System.out.println("아이디를 입력하세요.");
			String id = s.next();
			System.out.println("비밀번호를 입력하세요 :");
			int pass = s.nextInt();
			
			if(!id.equals(cid)) {
				System.out.println("아이디가 존재하지 않습니다.");
			} else if(pass!=cpass) {
				System.out.println("비밀번호가 다릅니다.");
			} else {
				System.out.println("환영합니다.");
				break;
			}
			
			
			
		}
	}

}
