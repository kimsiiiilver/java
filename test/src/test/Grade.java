package test;

import java.util.Scanner;

public class Grade {
	
	private int math;
	private int seience;
	private int english;
	
	public int getMath() {
		return math;
	}
	public int getSeience() {
		return seience;
	}
	public int getEnglish() {
		return english;
	}
	public Grade(int math, int seience, int english) {
		this.math = math;
		this.seience = seience;
		this.english = english;
	}

	public double average() {
		double ave = (double)(getMath()+getSeience()+getEnglish())/3;
		return ave;
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է� : ");
		int math = scanner.nextInt();
		int seience = scanner.nextInt();
		int english = scanner.nextInt();
		
		Grade me = new Grade(math, seience, english);
		System.out.printf("����� %.2f\n",me.average());
	}

}
