package sec01;

import java.util.*;

public class ���� {

	public static void main(String[] args) {
		//scanner Ŭ������ -1�� �Էµɶ����� ���� ������ �Է¹޾�
		//���Ϳ� �����ϰ� ���͸� �˻��Ͽ� ���� ū ���� ����ϴ� ���α׷��� �ۼ�

		List<Integer> list = new Vector<Integer>();

		Scanner s = new Scanner(System.in);


		while (true) {
			System.out.println("���ڸ� �Է��ϼ��� -1�� �Է��ϸ� �ߴ��մϴ�.");
			int num = s.nextInt();
			if(num==-1) break;
			list.add(num);
		}
		int max=list.get(0);
		for (int i = 1; i <list.size() ; i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		System.out.println("���� ū ���� : "+max+"�Դϴ�.");
	}

}
