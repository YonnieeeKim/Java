package cafe_extends_exam;

public class Car {
	private String color;
	private int account;

	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String toString() {
		return "[색상] " + color + "\t[생산수량] " + account;
	}

}
