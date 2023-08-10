package sec01_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ReadExample¹®Á¦1 {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("c:/temp/test7.txt");
		
		while(true) {
			int data = reader.read();
			if(data==-1)break;
			System.out.println((char)data);
		}

		
		reader.close();

	}

}
