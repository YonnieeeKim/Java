package ex_231103.exam_inner_class;

//내부 클래스
public class Main {
	public static void main(String[] args) {
		A a = new A();
		//1. 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();

		b.field1 = 3;
		b.method1();
		System.out.println();
		
		//2. 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1=4;
		c.method1();
		
		A.C.field2 = 3; // 정적필드.  	외부클래스.내부클래스.정적필드
		A.C.method2();  // 정적메서드. 	외부클래스.내부클래스.정적메서드
		System.out.println();
		
		//3. 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
