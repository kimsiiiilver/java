package sec01;

public class Student extends Human{
	
	int studentCode; //학번
	String studentDept;  //학과
	
	public Student(int weight, int height, int studentCode) {  //기본 생성자
		super(weight,height);
		this.studentCode = studentCode;
	}
	
	void study(String place) {
		System.out.println(place + "에서 공부합니다.");
	}
	
	void dressOn() {
		System.out.println("교복을 입어요.");
	}
	void dressOff() {
		System.out.println("교복을 벗어요.");
	}
	@Override
	String eat(String food) {
		return food+"(을)를 맛있게 먹었습니다.";
	}

}
