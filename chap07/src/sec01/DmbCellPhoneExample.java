package sec01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellphone dmbcellphone = new DmbCellphone("�ڹ���","����",10);
		
		System.out.println(dmbcellphone.model);//��ӹ��� �ʵ� ���
		dmbcellphone.turnOnDmb(); // �ڱ� �޼ҵ� ���
		dmbcellphone.bell(); // ��ӹ��� �޼ҵ� ���
		dmbcellphone.SendVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbcellphone.receiveVoice("��~ �� �ݰ����ϴ�.");
		dmbcellphone.hangUp();
		
	}

}
