package sec03;

public class �л�����1 {

	public static void main(String[] args) {

		Student student1 = new Student();
		System.out.println("�̸� : " + student1.name);
		System.out.println("���� : " + student1.age);
		
		Student student2 = new Student("ȫ����",30);
		System.out.println("�̸� : " + student2.name);
		System.out.println("���� : " + student2.age);
		
		Student student3 = new Student("ȫ����","20231111","010-5555-7777");
		System.out.printf("�̸��� %s �й��� %s ����ó %s",student3.name, student3.studentNumber, student3.phoneNumber);
		
	}

}
