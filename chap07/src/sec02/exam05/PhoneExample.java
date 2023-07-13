package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {

		Phone p = new SmartPhone();
		// 자식 객체를 부모 객체에 타입 변환 시킴(자동변환)

		System.out.println(p.cost);
		p.ring();
		p.powerOn(); // 오버라이드 메소드호출
		// p.videoOn(); 자식 클래스 메소드 호출 불가
		// p.phoneCase="하드케이스"; 자식 클래스 필드 사용 불가

		SmartPhone sp = (SmartPhone)p;
		//부모 객체를 자식 객체에 강제 타입 변환 시킴
		
		sp.phoneCase="소프트케이스";  //자식 객체 필드나 메소드 사용 가능
		sp.powerOn();
		sp.videoOn();  //부모 객체 메소드 사용 가능
		System.out.println(sp.cost);  // 같은 이름의 필드는 자식 객체 출력

		//Phone p2 = new Phone();
		//SmartPhone sp2 = (SmartPhone)p2;
		//자식 타입이 부모 타입으로 변환하지 않은 상태에서 
		//부모타입을 자식 타입으로 강제 변환은 되지 않음
		
		
	}

}
