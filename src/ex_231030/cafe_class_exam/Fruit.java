package ex_231030.cafe_class_exam;


public class Fruit {
	private String fname;
	private int price;


	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Fruit(String fname, int price) {
		this.fname = fname;
		this.price = price;
	}
	

}
