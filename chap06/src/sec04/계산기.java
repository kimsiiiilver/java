package sec04;

public class ���� {

	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	String mul(int x, int y) {
		String result;
		if (x == 0 || y == 0) {
			result = "0�� �Է��� �� �����ϴ�.";
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
