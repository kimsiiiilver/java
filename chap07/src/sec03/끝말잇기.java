package sec03;

import java.util.Scanner;

public class 끝말잇기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.println("게임에 참가하는 인원은 몇 명 입니까?>>");
		int user = s.nextInt();

		String[] name = new String[user];
		String[] game = new String[user];

		for (int i = 0; i < user; i++) {
			System.out.println("참가자의 이름을 입력하세요>>");
			name[i] = s.next();
		}

		System.out.println("시작하는 단어는 아버지 입니다.");
		game[user - 1]="아버지";
		a: while (true) {
			for (int i = 0; i < user; i++) {
				System.out.print(name[i] + ">>");
				game[i] = s.next();

				if (i == 0 && game[i].charAt(0) != game[user - 1].charAt(game[user - 1].length() - 1)) {
					System.out.println(name[i] + "님이 졌습니다.");
					break a;
				}
				if (i != 0 && game[i].charAt(0) != game[i - 1].charAt(game[i - 1].length() - 1)) {
					System.out.println(name[i] + "님이 졌습니다.");
					break a;
				}
			}

		}
	}

}
