package sec02;

import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		String origianlFilePath1 = NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "c:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(origianlFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String origianlFilePath2 = NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "c:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(origianlFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않을 때 : " + nonBufferTime + "ns");

		long BufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용하지 않을 때 : " + BufferTime + "ns");

		fis.close();
		fos.close();
	}

	static int data = -1;

	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while (true) {
			data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end - start);

	}
}
