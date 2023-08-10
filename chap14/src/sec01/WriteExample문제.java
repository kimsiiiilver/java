package sec01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample¹®Á¦ {

	public static void main(String[] args) throws Exception{

		
	OutputStream os = new FileOutputStream("c:/temp/test3.db");
	
	byte[] array = {10,20,30,40,50};
	
	os.write(array);
	
	os.flush();
	os.close();
	}

}
