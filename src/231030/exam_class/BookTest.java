package exam_class;

public class BookTest{
	public static void main(String[] args) {
		Magazine m1 = new Magazine("재미있는 과학잡지", 119, "BBC사이언스", "2016.08.25");
		Magazine m2 = new Magazine("엘르", 250, "Elle", "2022.01.08");
		
		System.out.println(m1.toString());
		System.out.println();
		System.out.println(m2.toString());
	}
}