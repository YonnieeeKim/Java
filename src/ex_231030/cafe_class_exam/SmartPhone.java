package ex_231030.cafe_class_exam;

public class SmartPhone {
	private String maker;
	private String name;
	private int price;
	private int discountRate;

	public SmartPhone() {

	}

	public SmartPhone(String maker, String name, int price) {
		this.maker = maker;
		this.name = name;
		this.price = price;
		this.discountRate = 0;
	}

	public SmartPhone(String maker, String name, int price, int discountRate) {
		this.maker = maker;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public int calculateDiscount() {
		return (int) (price*discountRate/100.0);
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public void show() {
		System.out.println(getName()+"["+getMaker()+"]");
		System.out.println("가격 : "+getPrice());
		System.out.println("할인가격  "+"("+getDiscountRate()+"%) : "+ calculateDiscount());
		System.out.println("---------------------------------");
	}

}
