package exam_inner_class;
//내부 클래스
class A {
	private int num;
	static int number;

	A() {
		System.out.println("A 객체가 생성됨");
	}

	class B {
		int field1;

		B() {
			num = 5;
			number = 3;
			System.out.println("B 객체가 생성됨");
		}

		void method1() {
			System.out.println("num : " + num);
			System.out.println("number : " + number);
			System.out.println("field1 : " + field1);
		}
	}
	/*내부 클래스 - 정적 멤버 클래스*/
	static class C {
		int field1;
		static int field2;

		C() {
			// num = 10;	//정적 멤버 클래스는 외부 클래스의 인스턴스 멤버를 가질 수 없다.
			number = 9;		// 정적 멤버 클래스는 외부 클래스의 정적 멤버를 가질 수 있다.
			System.out.println("C 객체가 생성됨");
		}

		void method1() {
			System.out.println("field1 : " + field1);
		}

		static void method2() {
			System.out.println("field2 : " + field2);
		}
	}
	
	void method() {
		class D{
			int field3;
			D(){
				System.out.println("C 객체가 생성됨");
			}
			void method1() {
				System.out.println("field3 : "+field3);
			}
		}
		D d = new D();
		d.field3 = 3;
		d.method1();
	}
}
