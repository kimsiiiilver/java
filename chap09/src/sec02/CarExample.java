package sec02;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.stop();
	
		Car2 car2 = new Car2();
		car2.truck.stop();
		
		car2.speedDown();
	}

}
