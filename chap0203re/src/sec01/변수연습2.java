package sec01;

public class 변수연습2 {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 4;
		
		System.out.println("x의 값은 : "+x);
		System.out.println("y의 값은 : "+y);

		int z;
		z=x;
		x=y;
		y=z;
		
		System.out.println("x의 값은 : "+x);
		System.out.println("y의 값은 : "+y);

	}

}
