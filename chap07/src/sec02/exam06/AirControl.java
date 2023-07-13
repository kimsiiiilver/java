package sec02.exam06;

public class AirControl extends RemoteControl{

	int cost = 2000;
	String color;
	
	
	
	@Override
	void powerOn() {
		System.out.println("에어컨이 켜집니다.");
	}



	public AirControl(String company) {
		super(company);
	}
	
	
	
	

}
