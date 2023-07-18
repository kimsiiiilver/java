package 보강숙제0718;

public class IPTV extends ColorTV{

	String IP;
	
	public IPTV(String IP, int size, int cost ) {
		super(size, cost);
		this.IP=IP;
	}
	
	public void printProperty() {
		System.out.println("IPTV 주소 : " +IP+", " +getSize()+"인치 "+cost+"만원");
	}
}
