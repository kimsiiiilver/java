package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2명의 이름과 처리코드를 입력 받으세요
		// 예) 홍길동 C88, 장동건 B70
		// 맨 앞 문자는 등급 나머지 두글자는 점수
		// 등급은 A~D등급까지 존재 A등급은 점수의 20%가산,
		// B등급은 점수에 10% 가산
		// C등급은 점수에 5% 가산입니다.
		// 최종점수가 90점 이상이면 "최우수", 80이상이면 "우수"
		// 나머지는 "일반"
		// 최종출력 -> 홍길동님은 최우수 등급입니다.

		Scanner s = new Scanner(System.in);

		String[] name = new String[2]; //이름 저장하는 배열
		String[] code = new String[2]; //처리코드 저장 배열
		int score[] = new int[2]; //점수 저장 배열

		for (int i = 0; i < 2; i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = s.next();

			System.out.println("처리코드를 입력하세요.");
			code[i] = s.next();
			
			score[i]= Integer.parseInt(code[i].substring(1));

			switch (code[i].charAt(0)) {
			case 'A':
				score[i]*=1.2;
				break;
			case 'B':
				score[i]*=1.1;
				break;
			case 'C':
				score[i]*=1.05;
				break;
			}
		}
		for (int i = 0; i < 2; i++) {
			System.out.print(name[i]+"님은 ");
			if(score[i]>=90) {
				System.out.print("최우수");
			} else if(score[i]>=80) {
				System.out.print("우수");
			}else {
				System.out.print("일반");
			}
			System.out.println("등급 입니다.");
			
		}
		
		

	}

}
