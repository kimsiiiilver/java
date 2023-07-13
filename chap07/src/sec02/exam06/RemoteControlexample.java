package sec02.exam06;

public class RemoteControlexample {
	
	public static void main(String[] args) {
		
		RemoteControl rc = new TvControl("»ï¼Û");
		
		System.out.println(rc.cost);
		//System.out.println(rc.color);
		
		rc.powerOff();
		//   rc.powerOn(10);
		
		method(rc);
		
	}
	public static void method(RemoteControl remoteControl) {
		
		if(remoteControl instanceof TvControl) {
			TvControl tc = (TvControl)remoteControl;
			System.out.println(tc.cost);
			tc.powerOn(10);
		}
	}
	

}
