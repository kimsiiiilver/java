package sec01;

public class Cellphone {
	 String model;
	String color;
	
	void PowerOn( ) {System.out.println("전원을 켭니다.");}
	void PowerOff( ) {System.out.println("전원을 끕니다.");}
	void bell( ) {System.out.println("벨이 울립니다.");}
	void SendVoice(String message) {System.out.println("자기 : "+ message);}
	void receiveVoice(String message ) {System.out.println("상대방 : "+message);}
	void hangUp( ) {System.out.println("전화를 끊습니다.");}
			
}
