package exam_class_extends_check;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		super();
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString()+":"+getDept();
	}

}
