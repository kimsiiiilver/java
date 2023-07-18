package sec02;

public class ImplementationC implements interfaceC {

	public void methodB() {
		System.out.println("메소드B 실행");
	}

	public void methodA() {
		System.out.println("메소드A 실행");
	}

	public void methodC() {
		System.out.println("메소드C 실행");
	}

	public static void main(String[] args) {
		ImplementationC imple = new ImplementationC();
		
		interfaceC ic = imple;
		//인터페이스C의 객체인 ic는 A와 B의 모든 메소드 사용 가능함
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
