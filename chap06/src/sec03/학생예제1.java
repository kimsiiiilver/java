package sec03;

public class 학생예제1 {

	public static void main(String[] args) {

		Student student1 = new Student();
		System.out.println("이름 : " + student1.name);
		System.out.println("나이 : " + student1.age);
		
		Student student2 = new Student("홍수아",30);
		System.out.println("이름 : " + student2.name);
		System.out.println("나이 : " + student2.age);
		
		Student student3 = new Student("홍수아","20231111","010-5555-7777");
		System.out.printf("이름은 %s 학번은 %s 연락처 %s",student3.name, student3.studentNumber, student3.phoneNumber);
		
	}

}
