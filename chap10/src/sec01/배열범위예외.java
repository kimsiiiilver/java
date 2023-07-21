package sec01;

public class 배열범위예외 {

	
	public static void main(String[] args) {

		String[] a = new String[10];
		a[0]="가나다";
		String data1=a[0];
		
		System.out.println(data1);
		
		String data2 = args[0];
		System.out.println(data2);
	}

}
