package sce01;

public class SmartTelevison implements RemoteControl, Searchable {

	private int volume;

	// Searchable의 추상 메소드의 실체 메소드
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	public void turnOn() {
		System.out.println("스마트 티비를 켭니다.");

	}

     //RemoteControl의 추상 메소드 3개의 실체 메소드
	public void turnOff() {
		System.out.println("스마트 티비를 끕니다.");
	}

	public void setVolume(int volume) {

	}

	public void setvolume(int volmue) {
		if (volmue > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volmue < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volmue;
		}
		System.out.println("현재 스마트 티비 볼륨 : " + this.volume);

	}

}
