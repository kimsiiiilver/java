package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator(); //���ϰ�x, ����ȣ�� x
		myCalc.println("������");
		
		int result1 = myCalc.plus(6, 4);  //���ϰ� o, ����ȣ�� x
		System.out.println(result1);
		
		double result2 = myCalc.avg(10, 15);   //���ϰ� o, ����ȣ�� o
		System.out.println(result2);
		
		myCalc.execute(); //���ϰ�x, ����ȣ�� 3��
	}

}
