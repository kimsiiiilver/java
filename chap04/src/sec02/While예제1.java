package sec02;

public class While예제1 {

	public static void main(String[] args) {
		System.out.println("구구단 5단");
		int num1 = 5;
		int i = 1;

		while (i <= 9) {
			System.out.println(num1 + "*" + i + "=" + (num1 * i));
			i++;
		}
	}

}
