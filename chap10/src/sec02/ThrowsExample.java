package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
			
		}catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʾƿ�");
		}
	}

	public static void findClass() throws ClassNotFoundException{
		Class c = Class.forName("java.util.Scaner");
	}
}
