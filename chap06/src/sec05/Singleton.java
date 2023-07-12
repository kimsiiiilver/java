package sec05;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {} //������

	static Singleton getInstance() {
		return singleton;
	}
	
	public static void main(String[]args) {
		//Singleton obj1 = new Singleton();
		//Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
	}
}
