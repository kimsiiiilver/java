package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator(); //리턴값x, 내부호출 x
		myCalc.println("가나다");
		
		int result1 = myCalc.plus(6, 4);  //리턴값 o, 내부호출 x
		System.out.println(result1);
		
		double result2 = myCalc.avg(10, 15);   //리턴값 o, 내부호출 o
		System.out.println(result2);
		
		myCalc.execute(); //리턴값x, 내부호출 3번
	}

}
