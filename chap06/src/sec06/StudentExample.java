package sec06;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		Scanner s = new Scanner(System.in);
		
		boolean run = true;
		boolean check = false;
		
		while(run) {
			if(check == false) {
				check = student.checkLogin();
			}
			
			if(check) {
				System.out.println("�۾��� �����ϼ���.");
				System.out.println("1. �α׾ƿ� | 2. ���� �Է�");
				int choice=s.nextInt();
				if (choice==1) {
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					run = false;
				} else if(choice==2) {
					student.inputExam();
					
				}
			}else {
				System.out.println("�α����� �����Ͽ����ϴ�.");
			}
			
		}
	}
	
}
