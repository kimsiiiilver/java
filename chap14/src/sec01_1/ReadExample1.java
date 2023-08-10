package sec01_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {

		Writer writer = new FileWriter("c:/temp/address3.txt");

		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요."); // 예)광주광역시 서구 광천동
		String add = s.nextLine(); // 콘솔 창에서 광주광역시만 나오게 출력
		writer.write(add);
		writer.flush();
		writer.close();

		Reader reader = new FileReader("c:/temp/address3.txt");

		char[] buffer = new char[5];
		int readNum = reader.read(buffer, 0, 5);
		if (readNum != -1) {
			for (int i = 0; i < buffer.length; i++) {
				System.out.print(buffer[i]);
			}
		}
		reader.close();

	}

}
