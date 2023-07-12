package sec02;

public class 타입변환예제1 {

	public static void main(String[] args) {
		Car car = new Car();
		Sedan sedan = new Sedan();
		Sonata sonata = new Sonata();

		Car car2 = sedan;
		//sedan 클래스 타입은 Car 클래스의 자식 클래스이므로 
		//sedan 클래스 타입이 Car 클래스 타입으로 자동 변환
		
		Car car3 = sonata;
		//sonata 클래스 타입은 Car 클래스의 자손 클래스이므로 
		//sonata 클래스 타입 또한 Car 클래스 타입으로 자동 변환
		
		// Truck car3 = sonata;
		// Truck 클래스 타입은 sonata 클래스와 연관되지 않아 자동 변환 불가

	}

}