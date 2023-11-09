package ex_231108.exam_object_stream;

import java.io.Serializable;

public class Person implements Serializable {
	//인터페이스 구현
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [ 이름 = "+name+", 나이 = "+age+" ]";
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
	
	

}
