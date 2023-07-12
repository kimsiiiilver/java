package sec04;

public class 계산기 {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	String mul(int x, int y) {
		String result;
		if (x == 0 || y == 0) {
			result = "0은 입력할 수 없습니다.";
		} else {
			result = String.valueOf(x * y);
		}
		return result;
	}

	int minus(int x, int y) {
		int result;
		if (x < y) {
			result = y - x;
		} else {
			result = x - y;
		}
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}

}
