package sec02;

public class 자동차예제1 {

	public static void main(String[] args) {
		car myCar = new car(); //car객체생성
		
		System.out.println("회사 이름 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		
		myCar.company="페라리";
		myCar.model="아벤타도르";
		
		System.out.println("회사 이름 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
	}

}
