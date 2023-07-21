package sec01;


public class 널포인터예외 {

	public static void main(String[] args) {
		int num = 5;
		
		String b = String.valueOf(num);
		System.out.println(b);
		
		String c = Integer.toString(num);
		System.out.println(c);

		/*ValueOf, toString 모두 Object 타입의 값을 String 으로 변환
		
		단 toString은 null 처리 불가
		Object 담긴 값이 String 아니여도 출력
		
		ValueOf는 null 값 처리됨
		Object 값이 String이 아니면 출력 불가*/
	}

}
