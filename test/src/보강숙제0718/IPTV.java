package ��������0718;

public class IPTV extends ColorTV{

	String IP;
	
	public IPTV(String IP, int size, int cost ) {
		super(size, cost);
		this.IP=IP;
	}
	
	public void printProperty() {
		System.out.println("IPTV �ּ� : " +IP+", " +getSize()+"��ġ "+cost+"����");
	}
}
