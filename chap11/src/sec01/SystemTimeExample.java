package sec01;

public class SystemTimeExample {

	public static void main(String[] args) {

		long time1 = System.nanoTime();
		// ���۽ð� (����Ÿ�� : 10����� 1��)
	
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum+=i;
		}

		long time2 = System.nanoTime();
		//�� �ð�
		
		System.out.println("1���� �鸸������ �� : "+ sum);
		System.out.println("��꿡 "+ (time2-time1)+"�����ʰ� �ҿ�Ǿ����ϴ�.");
	
		
	}

}
