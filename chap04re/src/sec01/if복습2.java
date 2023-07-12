package sec01;

import java.util.Scanner;

public class if복습2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("가수의 이름을 입력하세요.");
		String name = s.next();

		char last;
		
		if(name.length()==3) {
			last =name.charAt(2);
			} else {
				last = name.charAt(1);
			}
			System.out.println(last);
	}

}
