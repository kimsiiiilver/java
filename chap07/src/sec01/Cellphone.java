package sec01;

public class Cellphone {
	 String model;
	String color;
	
	void PowerOn( ) {System.out.println("������ �մϴ�.");}
	void PowerOff( ) {System.out.println("������ ���ϴ�.");}
	void bell( ) {System.out.println("���� �︳�ϴ�.");}
	void SendVoice(String message) {System.out.println("�ڱ� : "+ message);}
	void receiveVoice(String message ) {System.out.println("���� : "+message);}
	void hangUp( ) {System.out.println("��ȭ�� �����ϴ�.");}
			
}
