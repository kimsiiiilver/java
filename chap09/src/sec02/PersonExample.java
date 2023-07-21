package sec02;

public class PersonExample {

	public static void main(String[] args) {

		StudentA.StudentB stB = new StudentA().new StudentB();

		stB.name = "짱구";
		stB.age = 15;
		stB.sleep();

		StudentA sta = new StudentA();

		sta.person.wake();
		// sta.person.work(); 오버라이드 안 된 메소드는 직접 호출 불가
		sta.method1();

		// merhod2는 매개변수로 Person 클래스 타입을 넘겨줘야 함
		// 매개변수는 마지막에 ; 사용 안함
		sta.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}

				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
					//오버라이드 안된 메소드는 바로 호출 불가로 이중으로 메소드 호출
				}
			}
		);

	}

}
