package sec01.verify.exam04;


public class Parent {
	
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("parent()call");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation)call");
	}
	

}
