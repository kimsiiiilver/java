package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {

		// 2���� �̸��� ó���ڵ带 �Է� ��������
		// ��) ȫ�浿 C88, �嵿�� B70
		// �� �� ���ڴ� ��� ������ �α��ڴ� ����
		// ����� A~D��ޱ��� ���� A����� ������ 20%����,
		// B����� ������ 10% ����
		// C����� ������ 5% �����Դϴ�.
		// ���������� 90�� �̻��̸� "�ֿ��", 80�̻��̸� "���"
		// �������� "�Ϲ�"
		// ������� -> ȫ�浿���� �ֿ�� ����Դϴ�.

		Scanner s = new Scanner(System.in);

		String[] name = new String[2]; //�̸� �����ϴ� �迭
		String[] code = new String[2]; //ó���ڵ� ���� �迭
		int score[] = new int[2]; //���� ���� �迭

		for (int i = 0; i < 2; i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			name[i] = s.next();

			System.out.println("ó���ڵ带 �Է��ϼ���.");
			code[i] = s.next();
			
			score[i]= Integer.parseInt(code[i].substring(1));

			switch (code[i].charAt(0)) {
			case 'A':
				score[i]*=1.2;
				break;
			case 'B':
				score[i]*=1.1;
				break;
			case 'C':
				score[i]*=1.05;
				break;
			}
		}
		for (int i = 0; i < 2; i++) {
			System.out.print(name[i]+"���� ");
			if(score[i]>=90) {
				System.out.print("�ֿ��");
			} else if(score[i]>=80) {
				System.out.print("���");
			}else {
				System.out.print("�Ϲ�");
			}
			System.out.println("��� �Դϴ�.");
			
		}
		
		

	}

}
