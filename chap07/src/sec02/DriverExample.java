package sec02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); //  Driver 클래스 객체 생성
		Bus bus = new Bus();            // Bus 클래스 객체 생성
		Taxi taxi = new Taxi();           // Taxi 클래스 객체 생성
		
		bus.run();
		taxi.run();

		// driver.run(); driver 메소드는 매개변수가 있어야 실행 가능
		driver.driver(bus); //클래스 타입의 매개변수 추가
		driver.driver(taxi);
		
	}

}
