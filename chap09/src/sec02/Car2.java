package sec02;

public class Car2 {
	

	Car truck = new Car() {

		void speedUp(int speed) {
			this.speed += speed;
			System.out.println("속도가 올라갑니다. " + this.speed);
		}

		@Override
		void stop() {
			System.out.println("Car2가 멈춥니다.");
			speedUp(10);
			speedUp(50);
		}
	};

	// 로컬 익명 객체 대입
	void speedDown() {
		Car downCar = new Car() {

			@Override
			void stop() {
				this.speed -= 20;
				System.out.println("속도가 내려갑니다." + this.speed);
			}
		};
		
		//speedDown() 메소드를 호출하면 익명 객체안의 메소드가 자동으로 실행되지 않음
		downCar.stop();
	}
}
