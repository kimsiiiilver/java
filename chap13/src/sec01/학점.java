package sec01;

import java.util.*;

public class 학점 {

	public static void main(String[] args) {
		// scanner 클래스를 사용하여 학점(a,b,c,d,f)을 6번 문자로 입력받아
		// arraylist에 저장하고, arraylist를 검색하여 학점을
		// 점수(a=4.0, b=3.0, c=2.0, d=1.0, f=0)로 변환하여 평균을 출력하는 프로그램을 작성하세요

		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		// Arraylist<~~~> list = new ArrayList<>(); 위에것과 동일

		System.out.println("학점을 6번 입력하세여");
		System.out.println("A B C D F 중 선택해서 한 칸 띄우고 입력");

		for (int i = 0; i < 6; i++) {
			char grade = s.next().charAt(0);
			list.add(grade);
		}

		double sum = 0.0;
		double average = 0.0;

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;

			}
		}
		average = sum / 6;
		System.out.printf("평균점수는 : %s 입니다", average);
	}

}
