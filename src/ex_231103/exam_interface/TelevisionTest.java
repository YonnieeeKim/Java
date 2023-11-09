package ex_231103.exam_interface;


public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();

		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.setMute(true);
		tv.turnOff();
		RemoteControl.changeBattery();
		System.out.println();

		Radio radio = new Radio("표준 FM(MHz)", 95.9);
		radio.turnOn();
		radio.setVolume(10);
		radio.printRF();
		System.out.println(radio.toString());
		radio.turnOff();
		System.out.println();

		SmartTelevision smart = new SmartTelevision();
		smart.turnOn(); // 인터페이스에 선언된 메서드 접근 가능
		// rc.printChannel(); //구현 클래스의 메서드 접근은 불가능
		smart.search("http://www.naver.com(네이버)");
		smart.turnOff();

		System.out.println("====다형성에 의해 데이터 출력====");
		RemoteControl rc = new Television();
		rc.turnOn();

		// 구현 클래스의 메서드 호출방법1
		((Television) rc).printChannel();
		rc.turnOff();

		// 구현 클래스의 메서드 호출방법2
		rc = new Radio("표준 FM(MHz)", 95.9);
		rc.turnOn();
		((Radio) rc).printRF();

		Radio ro = (Radio) rc;
		ro.printRF();

		rc.turnOff();

		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(16);

		((SmartTelevision) rc).search("https://naver.com");
	}

}
