package sec01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Java"); // 0��° ��
		list.add("JDBC"); // 1��° ��
		list.add("Servlet/JSP"); // 2��° ��
		list.add(2, "Database"); 
		// 2��° �濡 database �߰��ϸ� 
		//���� �ִ� servlet�� �з��� 3���� ��
		
		list.add("iBATIS"); // 4��° ��
		
		int size = list.size();
		System.out.println("�� ��ü�� : "+ size);
		
		String skill = list.get(2); //2��° �� ������ ��������
		System.out.println("2 : "+skill);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		list.remove(2); // 2��° �� ������ ����(database)
		list.remove(2); // 2��° �� ������ ����(servlet)
		list.remove("iBATIS"); //�������� ���� ����
	}

}
