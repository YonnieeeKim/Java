package ex_231106.exam_multi_type_parameter;

public class ProductExample {
	public static void main(String[] args) {
		Product<Car, String> product1 = new Product<Car, String>();
		product1.setKind(new Car());
		product1.getKind().setColor("RED");
		product1.setModel("베뉴");
		System.out.println(product1.toString() + " [color : " + product1.getKind().getColor() + "]");

		Product<Car, String> product1_1 = new Product<Car, String>(new Car("RED"), "베뉴");
		System.out.println(product1_1.toString() + " [color : " + product1_1.getKind().getColor() + "]");

		Product<Tv, String> product2 = new Product<Tv, String>(new Tv(48), "스마트TV");
		System.out.println(product2.toString() + " [size : " + product2.getKind().getSize() + "인치 ]");

		Product<SmartPhone, String> product3 = new Product<SmartPhone, String>(new SmartPhone("삼성", "안드로이드"), "갤럭시 Z 플립 3");
		System.out.println(product3.toString() + " [size : " + product3.getKind().getCompany() + ", " + product3.getKind().getOs() + "]");
	}
}
