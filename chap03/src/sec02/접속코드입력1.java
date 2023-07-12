package sec02;

import java.util.Scanner;

public class 접속코드입력1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("관리자 코드를 입력하세요.");
		String code = s.next();
		
		String admun_id = code.substring(0,3);
		int admin_pass = Integer.parseInt(code.substring(3,7));
		
		System.out.println("아이디를 입력하세요");
		String name = s.next();
		
		System.out.println("비밀번호를 입력하세요");
		String pass = s.next();
		int password = Integer.parseInt(pass);
		
		if (name.equals(admun_id)) {
			if(password == admin_pass) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			} 
		}else {
					System.out.println("로그인 실패:아이디가 존재하지 않음");
				}
			}
		}




