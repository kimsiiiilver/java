package sec01;

import java.sql.Wrapper;

public class BoxingExample2 {

	public static void main(String[] args) {

		// Wrapper Ŭ���� �ڽ�(����)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// Wrapper Ŭ���� ��ڽ�(���� ����)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		Integer obj4 = new Integer(100);
		Integer obj5 = new Integer(100);
		
		if(obj4==obj5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
