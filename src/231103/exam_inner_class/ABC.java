package exam_inner_class;

//예제 클래스인 동시에 실행 클래스
public class ABC {
	private String msg = "A";

	public void print() {
		BC bc = new BC();
		bc.print();
	}

	public class BC {
		private String msg = "B";

		public void print() {
			C c = new C();
			c.print();
		}

		public class C {
			private String msg = "C";

			public void print() {
				System.out.println("msg : " + msg);
				System.out.println("this.msg : " + this.msg);
				System.out.println("C.this.msg : " + C.this.msg);
				System.out.println("BC.this.msg : " + BC.this.msg);
				System.out.println("ABC.this.msg : " + ABC.this.msg);
			}
		}
	}

	public static void main(String[] args) {
		/*
		ABC abc = new ABC();
		abc.print();
		*/
		/*
		ABC abc = new ABC();
		ABC.BC bc = abc.new BC();
		ABC.BC.C c = bc.new C();
		c.print();
		*/
		
		ABC.BC.C c = new ABC().new BC().new C();
		c.print();
		
		
	}

}
