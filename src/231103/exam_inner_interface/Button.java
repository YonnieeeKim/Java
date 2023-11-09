package exam_inner_interface;

public class Button {
	OnClickListner listner;
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
	
	interface OnClickListner{
		void onClick();
	}
}
