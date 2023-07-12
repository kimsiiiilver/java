package sec02;

public class 확인문제4re {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { // 전체 반복 횟수
			for (int j = 4; j >= 1; j--) { // *를 옆으로 출력
				if (i < j) {
					System.out.print(" "); // 공백출력
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // 줄 변경
		}
	}
}
