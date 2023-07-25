package sec01;

public class SubStringExample2 {

	public static void main(String[] args) {

		String ssn = "031225-3548812";
		
		String frisNum = ssn.substring(7, 8);

		// System.out.println(frisNum);
		
		if(frisNum.equals("1")||frisNum.equals("3")) {
			System.out.println("남자");
		}else  {
			System.out.println("여자");
		}
	}

}
