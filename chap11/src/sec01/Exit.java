package sec01;

public class Exit {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=100; i++) {
			if(i==50) {
				System.out.println("50�� ���ͼ� �����߽��ϴ�.");
				System.exit(0);
			} else if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
