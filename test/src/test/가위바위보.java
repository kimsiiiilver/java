package test;

import java.util.Scanner;

public class 가위바위보 {
	
	
	
	
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String game[] = { "가위", "바위", "보"};

		while (true) {
			System.out.println("가위바위보 게임 시작");
			System.out.println("가위, 바위, 보 중 하나를 입력하세요.\n종료하고 싶으시면 '종료'를 입력하세요.");
			String user = s.next();
			
			if(user.equals("종료")) {
				System.out.println("안녕히가세요.");
				break;
			}

			String com = game[(int) (Math.random() * 3)];

			System.out.println("컴퓨터 : " + com);

			if (user.equals(com)) {
				System.out.println("비겼습니다.");

			} else if (user.equals("가위") && com.equals("바위") || user.equals("바위") && com.equals("보")
					|| user.equals("보") && com.equals("가위")) {
				System.out.println("유저가 졌습니다.");
			} else {
				System.out.println("유저가 이겼습니다!");
			}

		}

	}

}
