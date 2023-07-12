package sec02;

public class 확인문제1 {

	public static void main(String[] args) {
		int b = 5;
		b = -b; // byte는 연산자 붙으면 int로 인식
		int result = 10 / b;
		System.out.println(result);

		// 방법2
		// byte b = 5;
		// int c = -b;
		// int result = 10/c;
		// System.out.println(result);

		// 방법3
		// int b = 5;
		// b = (byte)-b;
		// int result = 10 / b;
		// System.out.println(result);

		
	}

}
