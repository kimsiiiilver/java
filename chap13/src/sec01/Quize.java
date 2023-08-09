package sec01;

import java.util.*;

class Test {

	private String eng;// 영어단어
	private String kor;// 한글단어

	// 생성자를 통해서.....어쩌고 저쩌고...
	public Test(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() { // 영어단어 리턴 메소드
		return eng;
	}

	public String getKor() { // 한글단어 리턴 메소드
		return kor;
	}
}

public class Quize {
	Scanner s = new Scanner(System.in);
	List<Test> list = new Vector<>(); // 저장방식 벡터
	int[] question = new int[4];// 문제 보기 저장할 배열은 4개로 지정

	public Quize() {
		list.add(new Test("love", "사랑"));
		list.add(new Test("eye", "눈"));
		list.add(new Test("snow", "눈"));
		list.add(new Test("nose", "코"));
		list.add(new Test("apple", "사과"));
	}

	public void run() {
		System.out.println("누가 누가 잘 맞추나 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다.");
		System.out.println("현재" + list.size() + "개의 단어가 들어있습니다.");
		System.out.println();

		int num = 0; // 맞춘 정답 개수를 저장하는 변수

		while (true) {
			random(); // 랜덤한 값을 가진 문제 배열 생성 메소드 호출
			int answerNumber = (int) (Math.random() * question.length);
			// 0~3 중 한 값을 정답 번호로 저장

			int aneswrIndex = question[answerNumber];
			// 정답 번호의 배열에 있는 값이 정답

			System.out.println(list.get(aneswrIndex).getEng() + "?");
			// 정답의 영어단어를 호출해 문제로 출제함

			for (int i = 0; i < question.length; i++) {
				// 4개의 보기를 만들기 위한 반복문
				System.out.print("(" + (i + 1) + ")" + list.get(question[i]).getKor() + " ");
				// 0~3까지 ㅂ ㅐ열에 값을 넣어 각 인데스의 보기 출력
			}
			System.out.println(">> ");

			int input = s.nextInt();
			if (input == -1) {
				System.out.println("지금까지 " + num + "개의 정답을 맞추었어요.");
				System.out.println("게임을 종료합니다.");
				break;
			} else if (input - 1 == answerNumber) {
				System.out.println("정답입니다. 짱짱!");
				System.out.println();
				num++;
			} else {
				System.out.println("땡! 오답입니다.");
				System.out.println();
			}
		}

	}

	public void random() {
		// 4개의 보기에 임의의 벡터 인덱스를 주기 위한 메소드
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());
			// 0~문제의 개수(벡터 사이즈) 중 임의의 값 저장
			for (int j = 0; j < i; j++) { // 중복된 값이 없도록
				if (question[i] == question[j]) {
					i--;
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		Quize quize = new Quize();
		quize.run();
	}
}
