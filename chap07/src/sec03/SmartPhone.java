package sec03;

public class SmartPhone extends Phone {
	
	int cost; //����

	public SmartPhone(String owner, int cost) {
		super(owner);
		this.cost=cost;
	}
	
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
	

}
