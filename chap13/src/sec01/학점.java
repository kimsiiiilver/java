package sec01;

import java.util.*;

public class ���� {

	public static void main(String[] args) {
		// scanner Ŭ������ ����Ͽ� ����(a,b,c,d,f)�� 6�� ���ڷ� �Է¹޾�
		// arraylist�� �����ϰ�, arraylist�� �˻��Ͽ� ������
		// ����(a=4.0, b=3.0, c=2.0, d=1.0, f=0)�� ��ȯ�Ͽ� ����� ����ϴ� ���α׷��� �ۼ��ϼ���

		Scanner s = new Scanner(System.in);
		List<Character> list = new ArrayList<>();
		// Arraylist<~~~> list = new ArrayList<>(); �����Ͱ� ����

		System.out.println("������ 6�� �Է��ϼ���");
		System.out.println("A B C D F �� �����ؼ� �� ĭ ���� �Է�");

		for (int i = 0; i < 6; i++) {
			char grade = s.next().charAt(0);
			list.add(grade);
		}

		double sum = 0.0;
		double average = 0.0;

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				sum += 0;
				break;

			}
		}
		average = sum / 6;
		System.out.printf("��������� : %s �Դϴ�", average);
	}

}
