package sec02;

import java.io.*;

public class PrintStreamExample2 {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("c:/temp/printatream1.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다. ");
		
		ps.flush();
		ps.close();
	}

}
