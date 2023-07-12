package test;

public class 반복연습1 {

	public static void main(String[] args) {

		// for문 반복횟수를 알고 있을 때
		// while문 반복횟수를 모르고 특정 조건에서 종료하고 싶을 때

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		int i = 1;
		sum=0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
