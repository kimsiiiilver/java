package sec02.exam06;

public class AirControl extends RemoteControl{

	int cost = 2000;
	String color;
	
	
	
	@Override
	void powerOn() {
		System.out.println("�������� �����ϴ�.");
	}



	public AirControl(String company) {
		super(company);
	}
	
	
	
	

}
