package sce01;

public class SmartTelevison implements RemoteControl, Searchable {

	private int volume;

	// Searchable�� �߻� �޼ҵ��� ��ü �޼ҵ�
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");

	}

	public void turnOn() {
		System.out.println("����Ʈ Ƽ�� �մϴ�.");

	}

     //RemoteControl�� �߻� �޼ҵ� 3���� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("����Ʈ Ƽ�� ���ϴ�.");
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
		System.out.println("���� ����Ʈ Ƽ�� ���� : " + this.volume);

	}

}
