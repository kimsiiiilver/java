package sec01;

import java.util.Scanner;

public class IndexOfExample {

	public static void main(String[] args) {
		
		//String str1 = "���� �ڹٸ� ����մϴ�.";
		
		//int index = str1.indexOf("�ڵ�");
		
		//System.out.println(index);
		//----------------------------------------------------------------------------------------------------
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ּҸ� �Է��ϼ���.");
		String add = s.nextLine();
		
		if(add.indexOf("����")!= -1||add.indexOf("�ξ�")!= -1||add.indexOf("���")!= -1||add.indexOf("���")!= -1) {
			System.out.println("�ϱ� ���ֹ���");
		}else {
			System.out.println("���ư���");
		}

	}

}
