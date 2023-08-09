package sec01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Java"); // 0번째 방
		list.add("JDBC"); // 1번째 방
		list.add("Servlet/JSP"); // 2번째 방
		list.add(2, "Database"); 
		// 2번째 방에 database 추가하면 
		//원래 있던 servlet가 밀려서 3번이 됨
		
		list.add("iBATIS"); // 4번째 방
		
		int size = list.size();
		System.out.println("총 객체수 : "+ size);
		
		String skill = list.get(2); //2번째 방 데이터 가져오기
		System.out.println("2 : "+skill);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		
		list.remove(2); // 2번째 방 데이터 삭제(database)
		list.remove(2); // 2번째 방 데이터 삭제(servlet)
		list.remove("iBATIS"); //내용으로 삭제 가능
	}

}
