package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellphone dmbcellphone = new DmbCellphone("자바폰","검정",10);
		
		System.out.println(dmbcellphone.model);//상속받은 필드 출력
		dmbcellphone.turnOnDmb(); // 자기 메소드 출력
		dmbcellphone.bell(); // 상속받은 메소드 출력
		dmbcellphone.SendVoice("안녕하세요! 저는 홍길동인데요");
		dmbcellphone.receiveVoice("아~ 예 반갑습니다.");
		dmbcellphone.hangUp();
		
	}

}
