package ��������;

import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("�ο����� �Է��ϼ��� : ");
		
		int p = s.nextInt();
		
		Phon[] phone = new Phon[p];
		
		for(int i=0; i<p; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�) : ");
			phone[i]=new Phon(s.next(), s.next());
		}
		System.out.println("����Ǿ����ϴ�.");
		
		while(true) {
			boolean ac = true;
			System.out.print("�˻��� �̸� : ");
			String pp = s.next();
			
			if(pp.equals("����")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			for(int i=0; i<p; i++) {
				if(pp.equals(phone[i].name)) {
					System.out.println(phone[i].name+"�� ��ȭ��ȣ�� "+phone[i].phoneNumber+"�Դϴ�.");
					ac=false;
				}
			}
			if (ac) {
				System.out.println(pp+"�� �����ϴ�.");
			}
		}
	}

}
