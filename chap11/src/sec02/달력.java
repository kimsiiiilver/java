package sec02;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class �޷� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int year = s.nextInt();
		
		System.out.println("���� �Է��ϼ���");
		int month = s.nextInt();
		
		
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		start.set(year, month-1, 1);
		//���� �� ����, month-1�� ����� ��Ȯ�� ���� �ν���, ��¥�� 1�Ϸ� ����
		end.set(year, month,1 );
		//������ �� ����, �Է��� �������� 1�Ϸ� �����ϰ�
		end.set(Calendar.DATE, -1);
		//������ ��¥�� �Է��� �޿��� 1�� �� ��¥�� ����
		
		
		
		System.out.println("");
		System.out.println("========["+month+"��]========");
		System.out.println(" �� �� ȭ �� �� �� ��");
		
		int dayweek = start.get(Calendar.DAY_OF_WEEK);
		
		//���� ��ȣ ���� �Ͽ���1 �����7
		for(int i=1; i<dayweek; i++) {
			System.out.print("   ");
		} //���� ��ȣ�� �ش��ϴ� ��ŭ ���� �߰�(1�ڸ��� 3ĭ)
		
		//j�� ���� ǥ��
		for(int i=1, j=dayweek; i <=end.get(Calendar.DATE); i++, j++) {
			System.out.printf("%3d", i);
			//������ ���� 3�ڸ��� ���缭 ��¥ ���(2�ڸ��� ��¥, 1�ڸ��� ���� ����)
			
			if(j%7==0) { //���� ��ȣ�� 7 ������̸� �� �ٲ�
				System.out.println();
			}
			
			
		}
		

	}

}
