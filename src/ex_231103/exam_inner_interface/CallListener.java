package ex_231103.exam_inner_interface;


public class CallListener implements Button.OnClickListner {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		
	}
	
}
