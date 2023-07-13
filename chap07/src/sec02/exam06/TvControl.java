package sec02.exam06;

public class TvControl extends RemoteControl {

	int channel;
	int volume;
	int cost = 4000;

	void volumeUp() {
		System.out.println("소리를 키웁니다.");
	}

	@Override
	void powerOff() {
		System.out.println("티비가 꺼집니다.");
	}
	

	void powerOn(int channel) {
		System.out.println("티비가 켜집니다. 채널은"+channel+"입니다.");
		this.channel = channel;
	}

	public TvControl(String company) {
		super(company);
	}

}
