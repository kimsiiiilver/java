package sec04;

public class Calculator {

	int plus(int x, int y) {  //합계
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {  //평균
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void execute() {           //평균+출력
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}
	void println(String message) {       //출력
		System.out.println(message);
	}

}
