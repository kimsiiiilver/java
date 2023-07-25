package sec01;

public class ResourceExample {

	public static void main(String[] args) {
		
		
		Class clazz = Car.class;
		
		String photo1=clazz.getResource("b.jpg").getPath();
		String photo2=clazz.getResource("Çª¹Ù¿À3.jpg").getPath();

		System.out.println(photo1);
		System.out.println(photo2);
	}

}
