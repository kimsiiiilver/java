package sec04;

public class �л� {

	String gender; // ����
	String code; // �й�
	int score; // ��������

	public �л�(String gender, String code, int score) {
		this.gender = gender;
		this.code = code;
		this.score = score;
	}

	void start() {
		System.out.printf("���� : %s\n�а��ڵ� : %s\n���輺�� : %d\n", gender, code, score);
		String grade = end(score);
		System.out.printf("���� : %s\n", grade);
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
