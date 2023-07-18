package sce01;

public interface RemoteControl {
	// public int s =3;

	// 인터페이스 필드 올바른 사용 방법이 아님
	// 상수 필드만 사용 가능, 필드 이름을 대문자로 쓰는 것이 관례

	public int MIN_VOLUME = 3;
	public int MAX_VOLUME = 10;
	
	//public String NAME;
	//상수 필드는 반드시 초기값을 넣어야 함
	public String NAME = "홍길동";

	void turnOn();
	void turnOff();
	public void setVolume(int volume);
	//인터페이스 메소드는 추상 메소드로 구현함
	
	
	

}
