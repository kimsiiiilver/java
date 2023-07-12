package sec02;

import java.util.Scanner;

public class 확인문제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생 수가 몇 명 입니까?");
		int a = s.nextInt();
		System.out.println("한 줄에 몇명씩 앉습니까?");
		int b = s.nextInt();
		
		
		if (a%b==0) {
			System.out.println("총 "+(a/b)+"줄이고 남은 좌석 수는 "+(b-(a%b))+"개 입니다");
		}
		else {
			System.out.println("총 " +((a/b)+1)+ " 줄이고 남은 좌석 수는 "+(b-(a%b))+"개 입니다");
		}
			//System.out.printf("총 %d 줄이고 남은 좌석수는 %d개 입니다.",a/b, a%b);
		}
		

	}


