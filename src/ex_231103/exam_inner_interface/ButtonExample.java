package ex_231103.exam_inner_interface;


public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setOnClickListner(new CallListener());
		btn.touch();

		btn.setOnClickListner(new MessageListener());
		btn.touch();
	}

}
