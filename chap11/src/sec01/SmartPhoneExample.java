package sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		
		
		iPhone iphone = new iPhone("����", 1500000, "iphone14Max");
		
		System.out.println(iphone);
	}

}
