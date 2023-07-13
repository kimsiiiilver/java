package esc02.exam07;

public class SnowTire extends Tire{
	
	int cost;
	String condition;
	

	@Override
	void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
	
	public void stop() {
		System.out.println("스노우 타이어가 멈춥니다.");
	}
	
	

}
