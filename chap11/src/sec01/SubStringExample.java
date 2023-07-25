package sec01;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {
		//123bvvf@naver.com -> 아이디만 추출하기

		Scanner s= new Scanner(System.in);
		
		System.out.println("당신의 이메일을 입력해 주세요.");
		String email = s.next();

		int index = email.indexOf("@");	// index = 7
		
		String id = email.substring(0, index);
		
		System.out.println(id);
		
		String domain = email.substring(index+1);
		
		System.out.println(domain);
	
		
		
		
	}
}
