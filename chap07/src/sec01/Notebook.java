package sec01;

public class Notebook extends Computer{
	
	String cpu;
	String wifi;
	String bluetooth;
	String internet;
	String price = "1,000,000원";
	

	void wifiOn() {
		System.out.println("와이파이를 연결합니다.");
	}
	void wifiOff() {
		System.out.println("와이파이를 해제합니다.");
	}
	void internetOn() {System.out.println("인터넷을 연결합니다.");}
	void internetOff() {System.out.println("인터넷을 해지합니다.");}
}
