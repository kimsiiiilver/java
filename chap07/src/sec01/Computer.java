package sec01;

import java.util.Scanner;

public class Computer {
	
	Scanner s = new Scanner(System.in);
	
	String company;
	int price;
	String year;
	
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	
		void play(String game) {
			System.out.println(game + "�� �����մϴ�.");
			System.out.println("���Ḧ ���Ͻø� 'x'�� �Է��ϼ���.");
			while(true) {
				String input=s.next();
				if(input.equals("x")) {
					System.out.println(game + "�� �����մϴ�.");
					break;
				}
			}
			
		}
		
	
	
	
}
