package sec02;

import java.util.Scanner;

public class �����ڵ��Է�1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �ڵ带 �Է��ϼ���.");
		String code = s.next();
		
		String admun_id = code.substring(0,3);
		int admin_pass = Integer.parseInt(code.substring(3,7));
		
		System.out.println("���̵� �Է��ϼ���");
		String name = s.next();
		
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String pass = s.next();
		int password = Integer.parseInt(pass);
		
		if (name.equals(admun_id)) {
			if(password == admin_pass) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			} 
		}else {
					System.out.println("�α��� ����:���̵� �������� ����");
				}
			}
		}




