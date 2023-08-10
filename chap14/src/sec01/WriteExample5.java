package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample5 {

	public static void main(String[] args) throws Exception{

		
		OutputStream os = new FileOutputStream("c:/temp/address.txt");
		
		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		
		String add = s.nextLine();
		byte[]data=add.getBytes();
		
		
		os.write(data,5,4);  //한글은 한 글자 당 2byte
		
		os.flush(); //모든 바이트를 출력
		os.close(); //출력 스트림 닫기
	}

}
