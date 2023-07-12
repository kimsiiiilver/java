package sec02;

public class HankookTire extends Tire{

	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;  // 누적 회전수 1씩 증가
		
		
		//누적 회전수가 최대 회전수보다 작으면 회전수 증가시키고 몇 회 회전했는지 (타이어 수명) 출력
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 :" + (maxRotation - accumulateRotation) + "회");
			return true; //누적회전수가 최대 회전수 이상이면 타이어 펑크 출력
		} else {
			System.out.println("*** " + location + "HankookTire 펑크 ***");
			return false;
		}

	}

	
	
}
