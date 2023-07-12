package sec04;

public class KyecodeExample1 {

	public static void main(String[] args) throws Exception {

		// throws Exception 은 예외 상황을 화면에 출력함

		int keyCde;

		while (true) {
			keyCde = System.in.read();
			System.out.println("키코드 : " + keyCde);

			if (keyCde == 113) {break;}
			
		}
		System.out.println("종료");

	}

}
