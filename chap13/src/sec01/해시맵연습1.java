package sec01;

import java.util.*;

public class �ؽøʿ���1 {

	public static void main(String[] args) {
		//����� �α����� ��ĳ�ʸ� �̿��Ͽ� 3�� �Է� �ް�
		//��) �ѱ� 5000, �Ϻ� 12000, �߱� 30000
		//�ش� �����͸� �ؽø����� ������ ��
		//����ڰ� ���� �̸��� �Է��ϸ� �α����� ����ϴ� �ڵ带 �ۼ��ϼ���
		//����ڰ� �׸��̶�� �Է��ϸ� ����
		
		
		
		Map<String, Integer> map = new HashMap<>();
		Scanner s=new Scanner(System.in);
		System.out.println("3���� ����� �α����� �Է��ϼ���.");
		
		for(int i=0; i<3; i++) {
			map.put(s.next(), s.nextInt());
		}
		while(true) {
			System.out.print("���� �̸��� �Է����ּ��� : ");
			String name=s.next();
			if(name.equals("�׸�")) {
				System.out.println("�˻��� �����մϴ�.");
				break;
			}
			
			if(map.containsKey(name)) {
				System.out.println("�ش� ������ �α����� "+map.get(name));
			}else {
				System.out.println("�ش� ���� �����");
			}
		}
		
	}

}
