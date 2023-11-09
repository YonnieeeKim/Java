package ex_231031.cafe_extends_exam;


public class CarMain {
	public static void main(String[] args) {
		Monata m1 = new Monata("흰색", 5000, "승용", "NF   ");
		Monata m2 = new Monata("은색", 7000, "업무", "Brilliant");
		Monata m3 = new Monata("감홍색", 4000, "택시", "EF   ");
		Monata m4 = new Monata("검정색", 6000, "승용", "Hybrid");

		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
	}

}
