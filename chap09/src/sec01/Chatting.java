package sec01;

public class Chatting {


	void startChat(String chatId) {
		String nicName = chatId;
		
		//String nicName = null;
		//로컬 클래스가 포함된 메소드의 필드는 기본적으로 final이 붙어서 반드시 값을 대입해야 함
		
		//inputDate="어서오세요";
		//로컬 클래스의 메소드 안에 속한 필드는 해당 범위 안에서만 사용 가능함

		class Chat {

			public void start() {
				while (true) {
					String inputData = "안녕하세요";
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
