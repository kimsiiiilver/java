package test;

import java.util.Scanner;

public class �ݺ�����2re {
	

	
//	//static char com(int cc) {
//		
//		char[] comm = {'��','��','��','��','��'};
//		//comm[]
//		
//		
//
//}

	public static void main(String[] args) {

		// ��ǻ�� vs �ΰ� ������ ����(��,��,��,��,��)
		// 1- ���ӽ��� 2- ��������
		// C�� ������ ��ǻ�Ϳ��� �������� ����� ��� �� )��ǻ�� : ��
		// M�� ������ �ΰ��� ���� ��� ����� ���� ��) USER : ��
		// ����� �̰���ϴ�. ���

		Scanner s = new Scanner(System.in);

		System.out.println("������ ������ �����մϴ�");
		while (true) {
			System.out.println("1. ���� ����  | 2. ���� ���� ");
			int start = s.nextInt();

			if (start == 2) {
				System.out.println("������ �����մϴ�.");
				break;
			}

			int aa=(int) (Math.random() * 5) + 1;
			int bb=(int) (Math.random() * 5) + 1;
			
//			char com1 = com(aa);
//			System.out.println("��ǻ�� : "+ com1);
//			char user = com(bb);
//			System.out.println("���� : "+ user);
			if(aa>bb) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else if(aa<bb) {
				System.out.println("�����մϴ�! ������ �̰���ϴ�!");
			} else {
				System.out.println("�����ϴ�.");
			}
		}

	}

}
