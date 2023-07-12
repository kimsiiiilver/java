package sec02;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 도서관 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("광주시립도서관 방문을 환영합니다.");

		boolean run = true;
		int sum1 = 0;
		int sum2 = 0;

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("작업코드와 개수를 입력해주세요."); // A(대출)2(책 수), B(반납)2, C(종료)0
			System.out.println("A는 대출, B는 반납, C는 종료입니다.");
			String code = s.next();
			String a = code.substring(1);
			int b = Integer.parseInt(a);

			switch (code.charAt(0)) {
			case 'A':
				System.out.println("책" + b + "권을 대출합니다.");
				sum1 += b;
				break;
			case 'B':
				System.out.println("책" + b + "권을 반납합니다.");
				sum2 += b;
				break;
			default:
				System.out.println("종료합니다.");
				run = false;
			}
		}

	}

}
