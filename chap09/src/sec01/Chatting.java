package sec01;

public class Chatting {


	void startChat(String chatId) {
		String nicName = chatId;
		
		//String nicName = null;
		//���� Ŭ������ ���Ե� �޼ҵ��� �ʵ�� �⺻������ final�� �پ �ݵ�� ���� �����ؾ� ��
		
		//inputDate="�������";
		//���� Ŭ������ �޼ҵ� �ȿ� ���� �ʵ�� �ش� ���� �ȿ����� ��� ������

		class Chat {

			public void start() {
				while (true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nicName + "]" + inputData;
					sendMessage(message);

				}
			}

			void sendMessage(String message) {

			}
		}
	}
//	Chat chat = new Chat();
//	chat.start();

}
