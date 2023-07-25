package sec01;

public class ClassExample {

	public static void main(String[] args) {
		// Class clazz=Key.class;

		// Class clazz2=class.forName("sec01.Key");

		Key key = new Key(50);
		Class clazz = key.getClass();

		System.out.println(clazz.getName());
		// 패키지와 클래스 이름 출력

		Class clazz2 = Member.class;
		System.out.println(clazz2.getSimpleName());
		// 클래스 이름 출력
	}

}
