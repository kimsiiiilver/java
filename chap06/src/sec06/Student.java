package sec06;

import java.util.Scanner;

public class Student {
	
	Scanner s = new Scanner(System.in);
	
	private String name = "ȫ�浿";
	private String code = "A123";
	private int middleScore;
	private int finalScore;
	private double avg;
	
	
	final String id = "admin";
	final int password = 1234;
	
	public boolean checkLogin() {
		System.out.println("���̵� �Է��ϼ���.");
		if (!id.equals(s.next())) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return false;
		} 
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		if(!(password==s.nextInt())){
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return false;
		}
		return true;
	}
	
	public void inputExam() {
		System.out.println("�߰���� ������ �Է��ϼ���.");
		middleScore = s.nextInt();
		System.out.println("�⸻��� ������ �Է��ϼ���.");
		finalScore = s.nextInt();
		double avg = (double)(getMiddleScore()+getFinalScore())/2;
		setAvg(avg);
		System.out.printf("%s���� ��� ���� : %.1f\n",getName(), getAvg());
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getMiddleScore() {
		return middleScore;
	}
	public void setMiddleScore(int middleScore) {
		this.middleScore = middleScore;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	

}
