package sec03.exam07;

public class Ȯ�ι��� {

	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";

		double var = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;
		char var4 = (char) strValue.charAt(0);
		
		byte byteValue = 10;
		float folatValue = 2.5f;
		double doubleValue2 = 2.5;
		
		int result = byteValue + byteValue; //byteValue + byteValue = int�� �����ؾ� ��
		
		char c1 = 'a';
		int c2 = c1 + 1;
		
		System.out.println((char)c2);
		
		int x = 5;
		int y = 2;
		double result4 = (double) x/y;
		System.out.println(result4);
		
		double var5 = 3.5;
		double var6 = 2.7;
		
		int result5 = (int)(var5 + var6);

		System.out.println(result5);
		
		

	}

}
