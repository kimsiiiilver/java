package sec03;

public class Car2 {

	String company = "�����ڵ���";
	String color;
	String model;
	int maxSpeed;

	Car2() {

	}

	public Car2(String model) {
		this(model,"����",250);
	}

	public Car2(String color, String model) {
		this(model,color,250);
	}

	public Car2(String color, String model, int maxSpeed) {
		this.color = color;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

}
