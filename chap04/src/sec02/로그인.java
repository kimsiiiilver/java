package sec02;

import java.util.Scanner;

public class �α��� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String cid = "abc";
		int cpass = 1234;
		
		while(true) {
			System.out.println("���̵� �Է��ϼ���.");
			String id = s.next();
			System.out.println("��й�ȣ�� �Է��ϼ��� :");
			int pass = s.nextInt();
			
			if(!id.equals(cid)) {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			} else if(pass!=cpass) {
				System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			} else {
				System.out.println("ȯ���մϴ�.");
				break;
			}
			
			
			
		}
	}

}
