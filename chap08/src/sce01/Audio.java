package sce01;

public class Audio implements RemoteControl {

	private int volume;

	public void setVolume(int volume) {

	}

	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}

	public void turnOff() {
		System.out.println("������� ���ϴ�.");
	}

	public void setvolume(int volmue) {
		if (volmue > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volmue<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volmue;
		}
		System.out.println("���� ����� ���� : "+this.volume);

	}

}
