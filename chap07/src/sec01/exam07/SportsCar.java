package sec01.exam07;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}

	/*@Override
	public void stop() { //final 메소드 오버라이드 불가능
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}*/
}
