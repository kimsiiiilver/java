package sec02;

import java.util.Scanner;

public class Ȯ�ι���2re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�迭 ������ �Է��ϼ���");
		int num1 = s.nextInt();
		int[] num2 = new int[num1];
		
		for (int i = 0; i < num1; i++) {
		System.out.println("���ڸ� �Է��ϼ���.(1~9����)");
		num2[i]=s.nextInt();
		}
		int min=num2[0];
		for(int j=0; j<num2.length; j++) {
			if(min>num2[j]) {
				min=num2[j];
			}
			
		}
		System.out.println("�ּҰ� : "+min);
	}
}
