package ex_231108.exam_map;

public class Student implements Comparable<Student> {
	private int sno;
	private String name;

	public Student(int sno, String name) {
		this.name = name;
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " 학번 : " + sno;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return sno == student.sno;
		} else
			return false;
	}

	public int hashcode() {
		return sno;
	}

	@Override
	public int compareTo(Student o) {
		if (this.sno > o.sno)
			return 1;
		else if (this.sno == o.sno)
			return 0;
		else
			return -1;
	}

}
