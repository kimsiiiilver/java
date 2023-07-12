package sec01;

import java.util.Scanner;

public class Computer {
	
	Scanner s = new Scanner(System.in);
	
	String company;
	int price;
	String year;
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	
		void play(String game) {
			System.out.println(game + "을 시작합니다.");
			System.out.println("종료를 원하시면 'x'를 입력하세요.");
			while(true) {
				String input=s.next();
				if(input.equals("x")) {
					System.out.println(game + "을 종료합니다.");
					break;
				}
			}
			
		}
		
	
	
	
}
