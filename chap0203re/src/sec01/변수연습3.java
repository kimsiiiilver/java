package sec01;

import java.util.Scanner;

public class 변수연습3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = s.next();
		
		char middle = name.charAt(1);
		
		System.out.println(middle);
		
		

	}

}
