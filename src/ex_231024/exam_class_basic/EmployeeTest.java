package ex_231024.exam_class_basic;


public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.employeeData("홍길동", "01012345678",7000 );
		System.out.println(e1.toString());
		
	}
}