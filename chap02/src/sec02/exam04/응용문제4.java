package sec02.exam04;

import java.util.Scanner;

public class 응용문제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = s.next(); //이름입력
		System.out.println("나이를 입력하세요.");
		int age = s.nextInt(); //나이입력
		
		if(age<20) {
			System.out.println(name + "님은 청년입니다.");
		}else {
			System.out.println(name + "님은 장년입니다.");
			
			
			
		}
		
		
	}

}
