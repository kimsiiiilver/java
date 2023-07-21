package sec01;

public class ButtonExample {

	public static void main(String[] args) {
		Button btu = new Button();
		
		btu.setOnClickListener(new CallListener());
		btu.touch();
		
		btu.setOnClickListener(new MessageListener());
		btu.touch();
	}

}
