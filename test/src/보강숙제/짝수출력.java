package ��������;

import java.util.Scanner;

public class ¦����� {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int [] number = new int[10];
		int num = number.length;
		
		System.out.println("���� 10���� �Է��ϼ���. ");
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
