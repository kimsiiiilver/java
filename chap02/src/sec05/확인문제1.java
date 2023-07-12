package sec05;

import java.util.Scanner;

public class 확인문제1 {

	public static void main(String[] args) {
		// scanner활용 
		//당신의 이름은? 이름을 입력 받으세요 string
		//나이int
		//휴대폰 번호 가운데 4자리는? string
		//당신의 휴대폰 번호 끝자리는? string
		
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("중간고사 점수는?");
		double mid = s.nextDouble();
		System.out.println("기말고사 점수는?"); // 예) 82.43
		double last = s.nextDouble();
		System.out.println("리포트 점수는?");
		double report = s.nextDouble();

		//printf 사용          홍길동님의 평균 점수는 : 73.25입니다.
		
		double result = (mid + last + report) / 3;
		
		System.out.printf("%s님의 평균 점수는 : %5.2f 입니다", name, result); // name=%s result=%5.2f
		
		
		
		
	}

}
