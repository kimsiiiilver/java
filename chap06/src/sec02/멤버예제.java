package sec02;

public class 멤버예제 {

	public static void main(String[] args) {
		Member m = new Member();
		
		 m.name = "최하얀";
		 m.age = 23;

		System.out.printf("이름 : %s \n나이 : %d",m.name,m.age);
	}

}
