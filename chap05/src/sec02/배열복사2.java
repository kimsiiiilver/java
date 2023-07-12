package sec02;

import java.util.Scanner;

public class 배열복사2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 사용자에게 3명의 이름을 입력받아 배열에 저장하세요
		// string 타입의 5개짜리 배열을 별도로 생성하세요. 첫번째 배열에서 두번째 배열로 값을 복사하세요

		String name[] = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = s.next();
		}
		String name2[] = new String[5];
		System.arraycopy(name, 0, name2, 0, name.length);

		for (int i = 0; i < 5; i++) {
			if (i >= 3) {
				name2[i] = "영수";
			}
			System.out.print(name2[i] + ", ");
		}
	}

}
