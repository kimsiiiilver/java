package sec02.exam06;

public class RemoteControl {

	String company;
	int cost = 7000;
	String modelName;

	void powerOn() {
		System.out.println("������ �����ϴ�.");
	}

	void powerOff() {
		System.out.println("������ �����ϴ�.");
	}

	public RemoteControl(String company) {
		this.company = company;
	}

}
