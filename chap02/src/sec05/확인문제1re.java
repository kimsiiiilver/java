package sec05;

import java.util.Scanner;

public class 확인문제1re {

	public static void main(String[] args) {
		// scanner활용 
		//당신의 이름은? 이름을 입력 받으세요 string
		//나이int
		//휴대폰 번호 가운데 4자리는? string
		//당신의 휴대폰 번호 끝자리는? string
		
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("당신의 나이는?");
		int age = s.nextInt();
		System.out.println("당신의 휴대폰 번호 가운데 4자리는?");
		String middeNumber = s.next();
		System.out.println("당신의 휴대폰 번호 끝 4자리는?");
		String lastNumber = s.next();
		
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "\n");
		System.out.printf("휴대폰 번호 : 010-%s-%s", middeNumber, lastNumber);
		
		
		
	}

}
