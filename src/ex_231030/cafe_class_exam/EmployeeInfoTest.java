package ex_231030.cafe_class_exam;


public class EmployeeInfoTest {
	public static void main(String[] args) {
		EmployeeInfo[] e1 = { 
				new EmployeeInfo("111",780000),
				new EmployeeInfo("222",450000),
				new EmployeeInfo("333",570000)
		};
		
		/*for(int i =0; i<e1.length;i++) {
			e1[i].setSu();
			e1[i].setSe();
			e1[i].setBong();
			e1[i].setGrade();
		}
		*/
		
		System.out.println("봉급계산서");
		System.out.println("============================================");
		System.out.printf("사번\t기본급\t수당\t세금\t본봉\t등급\n");
		System.out.println("============================================");
		for(int i =0; i<e1.length;i++) {
			e1[i].show();
		}
	}

}
