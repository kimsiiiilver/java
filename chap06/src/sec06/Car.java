package sec06;

import java.util.Scanner;

public class Car {

	Scanner s = new Scanner(System.in);

	private String name;
	private String company;
	private String color;
	private int speed = 50;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor() {
		System.out.println("������ ������ �Է��ϼ���");
		String color = s.next();
		this.color = color;
		System.out.println("������ ���� : " + this.color);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed() {
		System.out.println("����Ű�� �����ּ���. a�� �ӵ�����, s�� �ӵ������Դϴ�.");
		String key = s.next();
		System.out.println("�ӵ����� �Է��ϼ���.");
		int sp = s.nextInt();

		if (key.equals("s") && speed < sp) {
			System.out.println("�ӵ��� ���̳ʽ��� �� �� �����ϴ�.");
		} else if (key.equals("s")) {
			speed -= sp;
		} else {
			speed += sp;
		}
		System.out.println("���� �ӵ��� : "+ speed);
	}

}
