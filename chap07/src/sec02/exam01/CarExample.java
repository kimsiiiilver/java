package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("노란색","BMW",3,"대");
		
		Car car = truck; // 자동 타입 변환

		car.speedUp(30); //부모 메소드 호출
		// car.maxSpeed(50);     타입 변환으로 자식 메소드 호출 불가 
		
		car.start(); //자식 메소드이지만 오버라이딩했기 때문에 호출 가능
	
	}

}
