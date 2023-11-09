package ex_231024.exam_class_basic;

public class Car {
	private int speed;
	private int gear;
	private String color;

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
		else
			this.speed = 0;
	}

	public int getSpeed() {
		return speed;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getGear() {
		return gear;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getColor() {
		return gear;
	}

	public void carData(int s, int g, String c) {
		speed = s;
		gear = g;
		color = c;

	}

	public void speedUp(int s) {
		speed += s;
	}

	public void speedDown(int s) {
		speed -= s;
	}

	public void printData() {
		System.out.println("속도 : " + speed + " 기어 : " + gear + " 색상 : " + color);
	}

	public String toString() {
		return "속도 : " + speed + " 기어 : " + gear + " 색상 : " + color;
	}

}
