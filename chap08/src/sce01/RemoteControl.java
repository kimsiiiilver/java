package sce01;

public interface RemoteControl {
	// public int s =3;

	// �������̽� �ʵ� �ùٸ� ��� ����� �ƴ�
	// ��� �ʵ常 ��� ����, �ʵ� �̸��� �빮�ڷ� ���� ���� ����

	public int MIN_VOLUME = 3;
	public int MAX_VOLUME = 10;
	
	//public String NAME;
	//��� �ʵ�� �ݵ�� �ʱⰪ�� �־�� ��
	public String NAME = "ȫ�浿";

	void turnOn();
	void turnOff();
	public void setVolume(int volume);
	//�������̽� �޼ҵ�� �߻� �޼ҵ�� ������
	
	
	

}
