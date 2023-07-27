package sec01;

import java.sql.Wrapper;

public class BoxingExample1 {

	public static void main(String[] args) {

		// Integer obj1 = new Integer(100); 정식코드
		// 대입값이 int 타입이면 자동으로 박싱해줌
		Integer obj = 100;
		System.out.println(obj);
		
		//int value = obj.intValue(); 정식 언박싱 코드
		// 대입값이 int 타입이면 자동으로 언박싱 해줌
		int value = obj;
		System.out.println(value);
		
		Integer obj2 = new Integer("100");
		// int value2 = Integer.parseInt(obj2);
		// Integer.parseInt는 String 타입을 Int 타입으로 변경
		//obj2가 String 타입이 아니므로 사용 불가능
		int value2 = Integer.valueOf(obj2);
		//valueOf를 이용해야 가능함
		
		int value3 = Integer.parseInt("300");
		System.out.println(value3);
	}

}
