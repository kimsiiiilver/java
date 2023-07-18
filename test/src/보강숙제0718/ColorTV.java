package 보강숙제0718;

public class ColorTV extends TV{

	int cost;

	public ColorTV(int size, int cost) {
		super(size);
		this.cost=cost;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치 "+cost+"만원");
	}

	
}
