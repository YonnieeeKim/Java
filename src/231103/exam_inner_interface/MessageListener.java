package exam_inner_interface;

public class MessageListener implements Button.OnClickListner  {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
		
	}

}
