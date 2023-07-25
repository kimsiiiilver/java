package sec01;

import java.util.Scanner;

public class IndexOfExample {

	public static void main(String[] args) {
		
		//String str1 = "나는 자바를 사랑합니다.";
		
		//int index = str1.indexOf("코드");
		
		//System.out.println(index);
		//----------------------------------------------------------------------------------------------------
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("주소를 입력하세요.");
		String add = s.nextLine();
		
		if(add.indexOf("중흥")!= -1||add.indexOf("두암")!= -1||add.indexOf("운암")!= -1||add.indexOf("용봉")!= -1) {
			System.out.println("북구 거주민임");
		}else {
			System.out.println("돌아가셈");
		}

	}

}
