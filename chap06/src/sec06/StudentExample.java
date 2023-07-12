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
				System.out.println("작업을 선택하세요.");
				System.out.println("1. 로그아웃 | 2. 성적 입력");
				int choice=s.nextInt();
				if (choice==1) {
					System.out.println("로그아웃 되었습니다.");
					run = false;
				} else if(choice==2) {
					student.inputExam();
					
				}
			}else {
				System.out.println("로그인이 실패하였습니다.");
			}
			
		}
	}
	
}
