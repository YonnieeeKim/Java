package cafe_class_exam;

public class FruiteTest {
	public static void main(String[] args) {
		Fruit b = new Fruit("banana", 4800);
		Fruit s = new Fruit("strawberry", 21000);
		Fruit p = new Fruit("persimmon", 19000);
		Fruit c = new Fruit("cherry", 12000);

		int total = 0;
		total += b.getPrice();
		total += s.getPrice();
		total += p.getPrice();
		total += c.getPrice();

		System.out.println("총금액 : " + total + "원");
		System.out.println("할인 후 결제 금액 : " + (int)(total * 0.85) + "원");

	}

}
