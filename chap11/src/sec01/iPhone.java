package sec01;

public class iPhone {

	String company;
	int cost;
	String name;
	
	
	public iPhone(String company, int cost, String name) {
		this.company = company;
		this.cost = cost;
		this.name = name;
	}


	@Override
	public String toString() {
		return company+"의 최신폰인 "+name+" 가격은 "+cost+"입니다.";
	}
	
	
			
}
