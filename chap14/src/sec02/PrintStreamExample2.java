package sec02;

import java.io.*;

public class PrintStreamExample2 {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("c:/temp/printatream1.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ ");
		ps.println("�����Ͱ� ����ϴ� ��ó�� ");
		ps.println("�����͸� ����մϴ�. ");
		
		ps.flush();
		ps.close();
	}

}
