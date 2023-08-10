package sec02;

import java.io.*;

public class CharacterConverStreamExample {

	public static void main(String[] args) throws Exception {

		write("���� ��ȯ ��Ʈ���� ����մϴ�."); // �޼ҵ� , �Ű�����:���ڿ�

		String data = read(); // read() - > �޼ҵ�, �Ű�����x, ����Ÿ�� String
		
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

		char[] buffer = new char[100];  //���������� 100�� ����
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
