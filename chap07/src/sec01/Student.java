package sec01;

public class Student extends Human{
	
	int studentCode; //�й�
	String studentDept;  //�а�
	
	public Student(int weight, int height, int studentCode) {  //�⺻ ������
		super(weight,height);
		this.studentCode = studentCode;
	}
	
	void study(String place) {
		System.out.println(place + "���� �����մϴ�.");
	}
	
	void dressOn() {
		System.out.println("������ �Ծ��.");
	}
	void dressOff() {
		System.out.println("������ �����.");
	}
	@Override
	String eat(String food) {
		return food+"(��)�� ���ְ� �Ծ����ϴ�.";
	}

}
