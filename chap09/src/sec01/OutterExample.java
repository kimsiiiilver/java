package sec01;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nestsd nestsd = outter.new Nestsd();
		nestsd.print();
		
		//Nestsd가 만약 정적 클래스라면 어떻게 호출??
		//Outter.Nestsd nestsd = new Outter.Nestsd();	

	}

}
