package sec01;

import java.util.*;

public class HashExample2 {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30));
		
		System.out.println(set.size());
	}

}
