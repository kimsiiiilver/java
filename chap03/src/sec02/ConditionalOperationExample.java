package sec02;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		//int score = 85;
		//char grade = (score>90)? 'A':((score>80)?'B':'C');
		//System.out.println(score + "점은 " + grade + "등급입니다.");
		
		// 사용자가 점수를 입력합니다.
		// 점수가 90점 이상 "수" 80점 이상 "우" 나머지 "미"
		
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = s.nextInt();
		
		char grade = (score>=90)?'수':((score>=80)?'우':'미');
		
		System.out.println("당신의 등급은 '" + grade +"'입니다.");

	}

}
