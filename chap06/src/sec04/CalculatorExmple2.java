package sec04;

public class CalculatorExmple2 {

	public static void main(String[] args) {

		Calculator2 myCalc = new Calculator2();

		double result1 = myCalc.areaRectangle(3.5);
		double result2 = myCalc.areaRectangle(3.5, 7.5);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);

	}

}
