package sec03;

public class 자동차예제1 {

	public static void main(String[] args) {
		
	
		Car car2 = new Car("BMW750i",250); //사용자 정의 생성자 호출
		
		System.out.println("모델명 : "+car2.model);
		System.out.println("속도 : "+car2.speed);
		System.out.println("제조회사 : "+car2.company);
	}

}
