package 보강숙제;

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
		System.out.println(company+"에서 만든"+year+"년형 "+inch+"인치 TV");
	}

	public static void main(String[]args) {
		TV myTV = new TV("삼성", 2023, 55);
		myTV.show();
	}
}
