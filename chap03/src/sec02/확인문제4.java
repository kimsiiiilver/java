package sec02;

import java.util.Scanner;

public class Ȯ�ι���4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л� ���� �� �� �Դϱ�?");
		int a = s.nextInt();
		System.out.println("�� �ٿ� ��� �ɽ��ϱ�?");
		int b = s.nextInt();
		
		
		if (a%b==0) {
			System.out.println("�� "+(a/b)+"���̰� ���� �¼� ���� "+(b-(a%b))+"�� �Դϴ�");
		}
		else {
			System.out.println("�� " +((a/b)+1)+ " ���̰� ���� �¼� ���� "+(b-(a%b))+"�� �Դϴ�");
		}
			//System.out.printf("�� %d ���̰� ���� �¼����� %d�� �Դϴ�.",a/b, a%b);
		}
		

	}


