package sec05;

import java.util.Scanner;

public class 확인문제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = s.next();
		System.out.println("2.주민번호 앞 6자리: ");
		String num1 = s.next();
		System.out.println("전화번호: ");
		String num2 = s.next();
		
		System.out.println("[입력한 내용]");
		System.out.printf("%s님의 주민번호는 %s 이고 연락처는 %s입니다."  ,name, num1, num2);
		//System.out.printf(name +"님의 주민번호는 " + num1 +"이고 연락처는 "+ num2+"입니다.");
		
		
		

	}

}
