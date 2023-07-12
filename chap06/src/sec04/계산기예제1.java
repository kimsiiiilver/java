package sec04;

public class 계산기예제1 {

	public static void main(String[] args) {
		계산기 myCalc = new 계산기();
		myCalc.powerOn();

		int result1 = myCalc.plus(5, 3);
		System.out.println(result1);

		int result2 = myCalc.minus(5, 3);
		System.out.println(result2);
		
		int result3 = myCalc.minus(3, 5);
		System.out.println(result3);
		
		String result4 = myCalc.mul(3, 5);
		System.out.println(result4);
		
		String result5 = myCalc.mul(3, 0);
		System.out.println(result5);
		
		double result6 = myCalc.divide(8, 2);
		System.out.println(result6);



	}

}
