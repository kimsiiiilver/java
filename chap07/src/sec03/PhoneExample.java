package sec03;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동");
		//추상 클래스는 직접 객체 생성 불가
		
		SmartPhone sp = new SmartPhone("홍길동", 1200000);
		
		sp.turnOn();  //추상클래스의 메소드 
		sp.internetSearch();   //객체 메소드
	}

}
