package sec02;

import java.io.*;
import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);

		FileOutputStream fos = new FileOutputStream("c:/temp/number.txt");
		Writer w = new OutputStreamWriter(fos);

		while (true) {
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
			String num = s.nextLine();
			if (num.equals("�׸�")) {
				break;
			}
			w.write(num + "\n");
		}
		w.flush();
		w.close();
		
		Reader reader = new FileReader("c:/temp/number.txt");
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data==null) break;
			System.out.println(data);
		}
		br.close();

	}

}
