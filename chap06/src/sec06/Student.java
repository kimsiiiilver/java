package sec06;

import java.util.Scanner;

public class Student {
	
	Scanner s = new Scanner(System.in);
	
	private String name = "홍길동";
	private String code = "A123";
	private int middleScore;
	private int finalScore;
	private double avg;
	
	
	final String id = "admin";
	final int password = 1234;
	
	public boolean checkLogin() {
		System.out.println("아이디를 입력하세요.");
		if (!id.equals(s.next())) {
			System.out.println("아이디가 존재하지 않습니다.");
			return false;
		} 
		System.out.println("비밀번호를 입력하세요.");
		if(!(password==s.nextInt())){
			System.out.println("비밀번호가 틀렸습니다.");
			return false;
		}
		return true;
	}
	
	public void inputExam() {
		System.out.println("중간고사 점수를 입력하세요.");
		middleScore = s.nextInt();
		System.out.println("기말고사 점수를 입력하세요.");
		finalScore = s.nextInt();
		double avg = (double)(getMiddleScore()+getFinalScore())/2;
		setAvg(avg);
		System.out.printf("%s님의 평균 점수 : %.1f\n",getName(), getAvg());
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
