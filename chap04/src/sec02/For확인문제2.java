package sec02;

import java.util.Scanner;

public class ForȮ�ι���2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�1 : ");
		int a = s.nextInt();
		System.out.print("���� �Է�2 : ");
		int b= s.nextInt();
		
		int sum = 0;
		for (int i=a; i<b; i++) {
			sum += i;
			System.out.print(i+ "+");
		}
		sum += b;
		System.out.print(b+"="+sum);
	}

}
