package 보강숙제;

import java.util.Scanner;

public class 짝수출력 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int [] number = new int[10];
		int num = number.length;
		
		System.out.println("정수 10개를 입력하세요. ");
		for(int i=0; i<num; i++) {
			number[i] = scanner.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(number[i]%2==0) {
				System.out.println(number[i]);
			}
			
		}
	
	
	
	
	
	}

}
