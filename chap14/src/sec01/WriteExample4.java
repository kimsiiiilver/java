package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample4 {

	public static void main(String[] args) throws Exception{

		
		OutputStream os = new FileOutputStream("c:/temp/test2.txt");
		
		byte[]data="ABC".getBytes();
		
		os.write(data);
		
		os.flush(); //��� ����Ʈ�� ���
		os.close(); //��� ��Ʈ�� �ݱ�
	}

}
