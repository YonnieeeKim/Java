package exam_class_basic;

public class Employee {

	public String name;
	public String pNumber;
	public int salary;

	public void employeeData(String n, String p, int s) {
		name = n;
		pNumber = p;
		salary = s;

	}
	
	public String toString() {
		return String.format("직원정보[ 사원명 : %s, 전화번호 = %s, 급여 = %d ]",name, pNumber, salary );
	}
	
	
	

}

