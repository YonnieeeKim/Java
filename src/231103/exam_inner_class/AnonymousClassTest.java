package exam_inner_class;
import exam_interface.RemoteControl;

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV ON");
				
			}

			@Override
			public void turnOff() {
				System.out.println("TV OFF");
				
			}

			@Override
			public void setVolume(int volume) {}
				
		};
		ac.turnOn();
		ac.turnOff();
	}

}
