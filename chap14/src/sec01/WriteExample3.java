package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{

		
		OutputStream os = new FileOutputStream("c:/temp/name.txt");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("입력해라");

		String kk = s.nextLine();
		byte[]data = kk.getBytes();
		
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush(); //모든 바이트를 출력
		os.close(); //출력 스트림 닫기
	}

}
