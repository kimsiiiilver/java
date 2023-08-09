package sec01;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("�ڹ�");
		set.add("���̵��");
		set.add("����");
		set.add("���̹�Ƽ��");
		set.add("���̵��");// ���� �����ʹ� �߰� �Ұ�

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		iter = set.iterator();
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear(); //��� ����
		if(set.isEmpty()) {
			System.out.println("�������");
		}
	}

}
