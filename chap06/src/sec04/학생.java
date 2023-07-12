package sec04;

public class 학생 {

	String gender; // 성별
	String code; // 학번
	int score; // 시험점수

	public 학생(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	void start() {
		System.out.printf("성별 : %s\n학과코드 : %s\n시험성적 : %d\n", gender, code, score);
		String grade = end(score);
		System.out.printf("학점 : %s\n", grade);
	}

	String end(int score) {
		String grade;
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		return grade;

	}

}
