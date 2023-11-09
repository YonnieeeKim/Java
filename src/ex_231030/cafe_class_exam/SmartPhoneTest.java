package ex_231030.cafe_class_exam;


public class SmartPhoneTest {
	public static void main(String[] args) {
		System.out.println("제품목록");
		SmartPhone s1 = new SmartPhone("삼성","갤럭시노트20",1594500,10);
		SmartPhone s2 = new SmartPhone("애플","iPhone14",1364000,10);
		SmartPhone s3 = new SmartPhone("삼성","갤럭시S23",1800000,25);
		
		s1.show();
		s2.show();
		s3.show();
				
	}

}
