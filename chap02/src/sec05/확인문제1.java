package sec05;

import java.util.Scanner;

public class Ȯ�ι���1 {

	public static void main(String[] args) {
		// scannerȰ�� 
		//����� �̸���? �̸��� �Է� �������� string
		//����int
		//�޴��� ��ȣ ��� 4�ڸ���? string
		//����� �޴��� ��ȣ ���ڸ���? string
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("�߰���� ������?");
		double mid = s.nextDouble();
		System.out.println("�⸻��� ������?"); // ��) 82.43
		double last = s.nextDouble();
		System.out.println("����Ʈ ������?");
		double report = s.nextDouble();

		//printf ���          ȫ�浿���� ��� ������ : 73.25�Դϴ�.
		
		double result = (mid + last + report) / 3;
		
		System.out.printf("%s���� ��� ������ : %5.2f �Դϴ�", name, result); // name=%s result=%5.2f
		
		
		
		
	}

}
