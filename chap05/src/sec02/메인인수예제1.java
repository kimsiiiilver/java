package sec02;

public class �����μ�����1 {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("���� ���� �����մϴ�.");
			System.exit(0);
		}
		
		String strMum1 = args[0];
		String strMum2 = args[1];
		
		int num1 = Integer.parseInt(strMum1);
		int num2 = Integer.parseInt(strMum2);
		int result = num1+num2;
		System.out.println(num1 + " + "+ num2 + " = "+result);
		
	}

}
