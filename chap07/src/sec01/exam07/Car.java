package sec01.exam07;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
	}
	public final void stop() {
		//final 메소드는 메소드 오버라이드 불가
		System.out.println("차를 멈춤");
		speed=0;
	}

}
