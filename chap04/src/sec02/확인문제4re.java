package sec02;

public class Ȯ�ι���4re {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) { // ��ü �ݺ� Ƚ��
			for (int j = 4; j >= 1; j--) { // *�� ������ ���
				if (i < j) {
					System.out.print(" "); // �������
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // �� ����
		}
	}
}
