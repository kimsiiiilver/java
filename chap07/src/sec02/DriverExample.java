package sec02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); //  Driver Ŭ���� ��ü ����
		Bus bus = new Bus();            // Bus Ŭ���� ��ü ����
		Taxi taxi = new Taxi();           // Taxi Ŭ���� ��ü ����
		
		bus.run();
		taxi.run();

		// driver.run(); driver �޼ҵ�� �Ű������� �־�� ���� ����
		driver.driver(bus); //Ŭ���� Ÿ���� �Ű����� �߰�
		driver.driver(taxi);
		
	}

}
