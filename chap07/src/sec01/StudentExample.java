package sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student(123,123,123);
		
		System.out.println(student.eat("덕복희.."));  //Human 메소드
		student.sleep(); //Human 메소드
		student.dressOn(); //student 메소드
		
		
	}

}
