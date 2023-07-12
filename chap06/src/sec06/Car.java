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
		System.out.println("변경할 색상을 입력하세요");
		String color = s.next();
		this.color = color;
		System.out.println("변경한 색상 : " + this.color);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed() {
		System.out.println("방향키를 눌러주세요. a는 속도증가, s는 속도감속입니다.");
		String key = s.next();
		System.out.println("속도값을 입력하세요.");
		int sp = s.nextInt();

		if (key.equals("s") && speed < sp) {
			System.out.println("속도는 마이너스가 될 수 없습니다.");
		} else if (key.equals("s")) {
			speed -= sp;
		} else {
			speed += sp;
		}
		System.out.println("현재 속도는 : "+ speed);
	}

}
