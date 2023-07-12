package sec02;

public class Tire {

	public int maxRotation; // �ִ� ȸ����
	public int accumulateRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumulateRotation;  // ���� ȸ���� 1�� ����
		
		
		//���� ȸ������ �ִ� ȸ�������� ������ ȸ���� ������Ű�� �� ȸ ȸ���ߴ��� (Ÿ�̾� ����) ���
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire ���� :" + (maxRotation - accumulateRotation) + "ȸ");
			return true; //����ȸ������ �ִ� ȸ���� �̻��̸� Ÿ�̾� ��ũ ���
		} else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}

	}

}