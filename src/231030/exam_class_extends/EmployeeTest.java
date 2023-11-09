package exam_class_extends;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Manager m = new Manager();

		e.setEmpData("김철수", "서울시 영등포구", "010-123-456", 1500000);
		System.out.println(e.toString());

		m.setMgrData("홍길동", "서울시 성동구", "010-789-012", 2000000, "대리", 100000);
		System.out.println(m.toString());

	}

}
