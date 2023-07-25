package sec01;

import java.util.Scanner;

public class ReplaceExample2 {

	public static void main(String[] args) {
		
		//String str1 = "나는 자바를 사랑합니다.";
		
		//int index = str1.indexOf("코드");
		
		//System.out.println(index);
		//----------------------------------------------------------------------------------------------------
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("주소를 입력하세요.");
		String add = s.nextLine();
		
		String newAdd = add.replace("광주", "광주광역시");
		
		System.out.println(newAdd);

	}

}
