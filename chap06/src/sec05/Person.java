package sec05;

public class Person {
	final String NARION="korea";
	final String SSN;
	String name;
	
	public Person(String ssn, String name) {
	this.SSN=ssn;
	this.name=name;
	}
	public static void main(String[]srgs) {
		Person p1 = new Person("123456-1234567", "ȫ�浿");
		
		System.out.println(p1.NARION);
		System.out.println(p1.SSN);
		System.out.println(p1.name);
			}
	

}
