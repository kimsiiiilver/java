package sec02;

import java.io.*;

public class CharacterConverStreamExample {

	public static void main(String[] args) throws Exception {

		write("문자 변환 스트림을 사용합니다."); // 메소드 , 매개변수:문자열

		String data = read(); // read() - > 메소드, 매개변수x, 리턴타입 String
		
		System.out.println(data);

	}

	public static void write(String str) throws Exception {

		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);

		writer.write(str);
		writer.flush();
		writer.close();

	}

	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("c:/temp/test1.txt");
		Reader reader = new InputStreamReader(fis);

		char[] buffer = new char[100];  //임의적으로 100을 지정
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
