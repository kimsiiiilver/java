package sec02.exam06;

public class TvControl extends RemoteControl {

	int channel;
	int volume;
	int cost = 4000;

	void volumeUp() {
		System.out.println("�Ҹ��� Ű��ϴ�.");
	}

	@Override
	void powerOff() {
		System.out.println("Ƽ�� �����ϴ�.");
	}
	

	void powerOn(int channel) {
		System.out.println("Ƽ�� �����ϴ�. ä����"+channel+"�Դϴ�.");
		this.channel = channel;
	}

	public TvControl(String company) {
		super(company);
	}

}
