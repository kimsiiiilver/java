package sec01;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nestsd nestsd = outter.new Nestsd();
		nestsd.print();
		
		//Nestsd�� ���� ���� Ŭ������� ��� ȣ��??
		//Outter.Nestsd nestsd = new Outter.Nestsd();	

	}

}
