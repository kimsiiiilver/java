package sec01;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("자바");
		set.add("제이디비씨");
		set.add("서블릿");
		set.add("아이바티스");
		set.add("제이디비씨");// 같은 데이터는 추가 불가

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		iter = set.iterator();
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear(); //모두 삭제
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
