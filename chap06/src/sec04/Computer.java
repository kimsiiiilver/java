package sec04;

public class Computer {
	
//�迭�� ��ü ������ �հ�(�迭�� ���� �������� ����)
	int sum1(int[]values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	public static void main(String[]args) {
		Computer myCom = new Computer();
		int[] values1 = {1,2,3};
		int result = myCom.sum1(values1);
		System.out.println(result);
		
		int result2 = myCom.sum1(new int[] {1,2,3});
		System.out.println(result2);
		
	}
}
