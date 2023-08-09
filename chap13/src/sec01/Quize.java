package sec01;

import java.util.*;

class Test {

	private String eng;// ����ܾ�
	private String kor;// �ѱ۴ܾ�

	// �����ڸ� ���ؼ�.....��¼�� ��¼��...
	public Test(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() { // ����ܾ� ���� �޼ҵ�
		return eng;
	}

	public String getKor() { // �ѱ۴ܾ� ���� �޼ҵ�
		return kor;
	}
}

public class Quize {
	Scanner s = new Scanner(System.in);
	List<Test> list = new Vector<>(); // ������ ����
	int[] question = new int[4];// ���� ���� ������ �迭�� 4���� ����

	public Quize() {
		list.add(new Test("love", "���"));
		list.add(new Test("eye", "��"));
		list.add(new Test("snow", "��"));
		list.add(new Test("nose", "��"));
		list.add(new Test("apple", "���"));
	}

	public void run() {
		System.out.println("���� ���� �� ���߳� ������ �����մϴ�.");
		System.out.println("-1�� �Է��ϸ� �����մϴ�.");
		System.out.println("����" + list.size() + "���� �ܾ ����ֽ��ϴ�.");
		System.out.println();

		int num = 0; // ���� ���� ������ �����ϴ� ����

		while (true) {
			random(); // ������ ���� ���� ���� �迭 ���� �޼ҵ� ȣ��
			int answerNumber = (int) (Math.random() * question.length);
			// 0~3 �� �� ���� ���� ��ȣ�� ����

			int aneswrIndex = question[answerNumber];
			// ���� ��ȣ�� �迭�� �ִ� ���� ����

			System.out.println(list.get(aneswrIndex).getEng() + "?");
			// ������ ����ܾ ȣ���� ������ ������

			for (int i = 0; i < question.length; i++) {
				// 4���� ���⸦ ����� ���� �ݺ���
				System.out.print("(" + (i + 1) + ")" + list.get(question[i]).getKor() + " ");
				// 0~3���� �� ������ ���� �־� �� �ε����� ���� ���
			}
			System.out.println(">> ");

			int input = s.nextInt();
			if (input == -1) {
				System.out.println("���ݱ��� " + num + "���� ������ ���߾����.");
				System.out.println("������ �����մϴ�.");
				break;
			} else if (input - 1 == answerNumber) {
				System.out.println("�����Դϴ�. ¯¯!");
				System.out.println();
				num++;
			} else {
				System.out.println("��! �����Դϴ�.");
				System.out.println();
			}
		}

	}

	public void random() {
		// 4���� ���⿡ ������ ���� �ε����� �ֱ� ���� �޼ҵ�
		for (int i = 0; i < 4; i++) {
			question[i] = (int) (Math.random() * list.size());
			// 0~������ ����(���� ������) �� ������ �� ����
			for (int j = 0; j < i; j++) { // �ߺ��� ���� ������
				if (question[i] == question[j]) {
					i--;
					continue;
				}
			}
		}
	}

	public static void main(String[] args) {
		Quize quize = new Quize();
		quize.run();
	}
}
