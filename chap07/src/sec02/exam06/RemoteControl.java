package sec02.exam06;

public class RemoteControl {

	String company;
	int cost = 7000;
	String modelName;

	void powerOn() {
		System.out.println("전원이 켜집니다.");
	}

	void powerOff() {
		System.out.println("전원이 꺼집니다.");
	}

	public RemoteControl(String company) {
		this.company = company;
	}

}
