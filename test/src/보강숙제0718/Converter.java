package ��������0718;

import java.util.Scanner;

abstract class Converter {
	
	protected double qwer;
	
	abstract protected double convert(double val); // �߻� �޼ҵ�

	abstract protected String getSrcString(); // �߻� �޼ҵ�

	abstract protected String getDestString(); // �߻� �޼ҵ�

	protected double ratio; // ����

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�");
		scanner.close();
	}
}