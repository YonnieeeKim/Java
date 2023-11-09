package ex_231101.exam_polymorphism;


class A {
	int a = 10;

	void b() {
		System.out.println("A");
	}
}

class AA extends A {
	int a = 20;

	void b() {
		System.out.println("AA");
	}

	void c() {
		System.out.println("C");
	}
}

class BB extends A {
	int a = 30;

	void b() {
		System.out.println("BB");
	}

	void d() {
		System.out.println("D");
	}
}

public class ClassTest {
	public static void main(String[] args) {
		// A a1 = new A();
		// AA a2 = new AA();
		A z = new AA(); //업캐스팅
		System.out.println(z.a);
		z.b();
		// z.c();

		((AA) z).c();
		System.out.println(((AA) z).a);

		AA a1 = (AA) z;
		System.out.println(a1.a);
		a1.c();

		z = new BB();
		System.out.println(z.a);
		z.b();
		((BB) z).d();
		System.out.println(((BB) z).a);

		BB b1 = (BB) z;
		b1.d();
		System.out.println(b1.a);
	}

}
