package sec04;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n", value);
		System.out.printf("��ǰ�� ����:%6d��\n", value);
		
		int value2 = 1234;
		System.out.printf("��ǰ�� ����:%d��\n", value2);
		System.out.printf("��ǰ�� ����:%6d��\n", value2);
		System.out.printf("��ǰ�� ����:%-6d��\n", value2);
		
		double area = 3.14159*10*10;
		System.out.printf("�������� %d�� ���� ����:%10.3f\n",10,area);//area �Ǽ����̶� f�� ����
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job);

	}

}
