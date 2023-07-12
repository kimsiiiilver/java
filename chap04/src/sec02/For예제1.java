package sec02;

public class For예제1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("1~10까지의 합 : " + sum);
	} 

}
//13579