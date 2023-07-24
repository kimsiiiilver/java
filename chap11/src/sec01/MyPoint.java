package sec01;

public class MyPoint {

	int a;
	int b;

	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Point("+a+", "+b+")";
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof MyPoint){
			MyPoint myPoint = (MyPoint) obj;
			if(this.a==myPoint.a && this.b==myPoint.b) {
				return true;
			}
		} 
		
		return false;
	}
	
	
	
	
}
