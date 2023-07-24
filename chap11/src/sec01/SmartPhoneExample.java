package sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		
		
		iPhone iphone = new iPhone("애플", 1500000, "iphone14Max");
		
		System.out.println(iphone);
	}

}
