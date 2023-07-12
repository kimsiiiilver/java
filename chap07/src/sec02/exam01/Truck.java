package sec02.exam01;

public class Truck extends Car {

	int weight; // 적재 용량
	String trunkSize; // 트렁크 사이즈
	int maxSpeed; // 최대속도

	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}
	
	//매개변수 int 1개짜리 고유 메소드, 리턴타입 x
	void maxSpeed(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		super.start();
		System.out.println("트럭이 출발합니다.");
	}

	@Override
	void stop() {
		super.stop();
		System.out.println("트럭을 멈춥니다.");
	}
	

}
