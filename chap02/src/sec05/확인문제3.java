package sec05;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		int b = s.nextInt();
		
		
		//if(a>b) {
		//	System.out.println("���� ��� : " + (a-b));
		//} else {
			//System.out.println("���� ��� : "+ (a+b));
		//}
		
		int result;
		
		if (a > b) {
			result = a - b;
			System.out.println("���� ��� : "+ result);
		}
			else {
				result = a + b;
				System.out.println("���� ��� : "+ result);
			}
			
		}
		}

	


