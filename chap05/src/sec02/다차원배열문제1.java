package sec02;

import java.util.Scanner;

public class �������迭����1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[] name = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			name[i]=s.next();
		}

		int[][] num = new int[3][2];
		double a[] = new double[3];
		
		for (int j = 0; j <num.length; j++) {			// 3
			for (int k = 0; k<num[j].length; k++) {		// 2

				if(k==0) {
					System.out.println(name[j]+"�� �߰������� �Է��ϼ���.");
				} else {
					System.out.println(name[j]+"�� �⸻������ �Է��ϼ���.");
				}
				num[j][k] = s.nextInt();
			}
			int sum = num[j][0]+num[j][1];
			a[j] = (double)sum/2;
		}
		for(int i=0; i<3; i++) {
			System.out.println(name[i] +"�� ��������� "+a[i]+"�Դϴ�.");
		}
	}
}
