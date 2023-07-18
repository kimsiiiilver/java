package sce01;

public class Audio implements RemoteControl {

	private int volume;

	public void setVolume(int volume) {

	}

	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	public void setvolume(int volmue) {
		if (volmue > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volmue<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volmue;
		}
		System.out.println("현재 오디오 볼륨 : "+this.volume);

	}

}
