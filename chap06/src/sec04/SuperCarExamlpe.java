package sec04;

public class SuperCarExamlpe {

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("����ӵ� : " + speed + "km/h");
	}

}
