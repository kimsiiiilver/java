package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{

		
		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		
		byte[]data = "ABC".getBytes();
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush(); //모든 바이트를 출력
		os.close(); //출력 스트림 닫기
	}

}
