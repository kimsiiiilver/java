package sec05;

import java.util.Scanner;

public class È®ÀÎ¹®Á¦3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ã¹¹øÂ° ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		int a = s.nextInt();
		System.out.println("µÎ¹øÂ° ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		int b = s.nextInt();
		
		
		//if(a>b) {
		//	System.out.println("»¬¼À °á°ú : " + (a-b));
		//} else {
			//System.out.println("µ¡¼À °á°ú : "+ (a+b));
		//}
		
		int result;
		
		if (a > b) {
			result = a - b;
			System.out.println("»¬¼À °á°ú : "+ result);
		}
			else {
				result = a + b;
				System.out.println("µ¡¼À °á°ú : "+ result);
			}
			
		}
		}

	


