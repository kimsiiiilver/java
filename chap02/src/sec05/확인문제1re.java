package sec05;

import java.util.Scanner;

public class Ȯ�ι���1re {

	public static void main(String[] args) {
		// scannerȰ�� 
		//����� �̸���? �̸��� �Է� �������� string
		//����int
		//�޴��� ��ȣ ��� 4�ڸ���? string
		//����� �޴��� ��ȣ ���ڸ���? string
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("����� ���̴�?");
		int age = s.nextInt();
		System.out.println("����� �޴��� ��ȣ ��� 4�ڸ���?");
		String middeNumber = s.next();
		System.out.println("����� �޴��� ��ȣ �� 4�ڸ���?");
		String lastNumber = s.next();
		
		System.out.println("�̸� : " + name);
		System.out.print("���� : " + age + "\n");
		System.out.printf("�޴��� ��ȣ : 010-%s-%s", middeNumber, lastNumber);
		
		
		
	}

}
