package test;

import java.util.Scanner;

public class ���������� {
	
	
	
	
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String game[] = { "����", "����", "��"};

		while (true) {
			System.out.println("���������� ���� ����");
			System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.\n�����ϰ� �����ø� '����'�� �Է��ϼ���.");
			String user = s.next();
			
			if(user.equals("����")) {
				System.out.println("�ȳ���������.");
				break;
			}

			String com = game[(int) (Math.random() * 3)];

			System.out.println("��ǻ�� : " + com);

			if (user.equals(com)) {
				System.out.println("�����ϴ�.");

			} else if (user.equals("����") && com.equals("����") || user.equals("����") && com.equals("��")
					|| user.equals("��") && com.equals("����")) {
				System.out.println("������ �����ϴ�.");
			} else {
				System.out.println("������ �̰���ϴ�!");
			}

		}

	}

}
