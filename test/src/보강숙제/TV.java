package ��������;

public class TV {
	
	String company;
	int year;
	int inch;
	
	public TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(company+"���� ����"+year+"���� "+inch+"��ġ TV");
	}

	public static void main(String[]args) {
		TV myTV = new TV("�Ｚ", 2023, 55);
		myTV.show();
	}
}
