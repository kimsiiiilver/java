package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample5 {

	public static void main(String[] args) throws Exception{

		
		OutputStream os = new FileOutputStream("c:/temp/address.txt");
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��ϼ���");
		
		String add = s.nextLine();
		byte[]data=add.getBytes();
		
		
		os.write(data,5,4);  //�ѱ��� �� ���� �� 2byte
		
		os.flush(); //��� ����Ʈ�� ���
		os.close(); //��� ��Ʈ�� �ݱ�
	}

}
