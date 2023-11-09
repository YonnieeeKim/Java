package cafe_extends_exam;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String show() {
		return "이름 : " + name + ", 나이 : " + age;
	}

}

class Student extends Person {
	int num;

	public Student(String name, int age, int num) {
		super(name, age);
		this.num = num;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String show() {
		return super.show() + ", 학번 : " + num;
	}
}

class ForeignStudent extends Student {
	String country;

	public ForeignStudent(String name, int age, int num, String country) {
		super(name, age, num);
		this.country = country;

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String show() {
		return super.show() + ", 국적 : " + country;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 56);
		Student s = new Student("한늘봄", 41, 99010001);
		ForeignStudent f = new ForeignStudent("Olivia", 39, 97060004, "U.S.A");

		System.out.println("사람 ["+p.show() + "]");
		System.out.println("학생 ["+s.show() + "]");
		System.out.println("외국학생 ["+f.show() + "]");

	}
}
