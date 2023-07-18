package sce01;

public class MyClass {

	// 필드
	RemoteControl rc = new Television();

	// 생성자
	public MyClass() {
	}

	// 인터페이스를 매개변수로 하는 생성자
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn(); // Television에서 구현된 turnOn 호출
		rc.setVolume(5); //// Television에서 구현된 setVolume 호출
		rc.turnOff(); // Television에서 구현된 turnOff 호출
	}
	
	
	//Audio 객체의 메소드 호출
	void methodA() {
		RemoteControl rc = new Audio();	
		rc.turnOn(); 
		rc.setVolume(5);
		rc.turnOff(); 
	}
	
	//매개변수 객체의 메소드 호출
	void methodB(RemoteControl rc) {
		rc.turnOn(); 
		rc.setVolume(5);
		rc.turnOff(); 
	}

}
