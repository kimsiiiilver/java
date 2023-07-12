package test;

import java.util.Scanner;

public class 반복연습2re {
	

	
//	//static char com(int cc) {
//		
//		char[] comm = {'도','개','걸','윷','모'};
//		//comm[]
//		
//		
//
//}

	public static void main(String[] args) {

		// 컴퓨터 vs 인간 윷놀이 게임(도,개,걸,윷,모)
		// 1- 게임시작 2- 게임종료
		// C를 누르면 컴퓨터에서 랜덤으로 결과가 출력 예 )컴퓨터 : 걸
		// M를 누르면 인간의 랜덤 출력 결과가 나옴 예) USER : 윷
		// 당신이 이겼습니다. 출력

		Scanner s = new Scanner(System.in);

		System.out.println("윷놀이 게임을 시작합니다");
		while (true) {
			System.out.println("1. 게임 시작  | 2. 게임 종료 ");
			int start = s.nextInt();

			if (start == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}

			int aa=(int) (Math.random() * 5) + 1;
			int bb=(int) (Math.random() * 5) + 1;
			
//			char com1 = com(aa);
//			System.out.println("컴퓨터 : "+ com1);
//			char user = com(bb);
//			System.out.println("유저 : "+ user);
			if(aa>bb) {
				System.out.println("컴퓨터가 이겼습니다.");
			} else if(aa<bb) {
				System.out.println("축하합니다! 유저가 이겼습니다!");
			} else {
				System.out.println("비겼습니다.");
			}
		}

	}

}
