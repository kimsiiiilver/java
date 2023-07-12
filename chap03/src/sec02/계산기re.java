package sec02;

import java.util.Scanner;

public class 계산기re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요.");
		int a = s.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = s.nextInt();
		
		System.out.println("연산자를 입력하세요.(+,-,*,/)");
		String c = s.next();

		int temp;
		int result;
		double result2;
		
		if(b>a) {
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println("");
		
		if (c.equals("+")) {
			result = a+b;
			System.out.println("두 수의 합계는 : " + result +"입니다.");
		}
		
		if(c.equals("*")) {
			result = a * b;
			System.out.println("두 수의 곱셈은 : " + result + "입니다.");
		}
		
		if(c.equals("-")) {
			result = a-b;
			System.out.println("두 수의 뺄셈은 : "+ result + "입니다.");
		}
		
		if(c.equals("/")) {
			
		    result2 =(double) a/b;
			System.out.println("두 수의 나눗셈은 : " + result2 + "입니다.");
		}
			
			
		
			
			
		}
		}
		
