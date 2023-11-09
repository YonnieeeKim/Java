package ex_231030.exam_super;


class SuperX {
	private int x;

	public SuperX(int x) {
		this.x = x;
		System.out.println("x = " + x);
	}

}

class SubY extends SuperX {
	private int y;
	public SubY(int x, int y) {
		super(x);
		this.y = y;
		System.out.println("y = " + y);
	}
}

public class Construct{
	public static void main(String[] args) {
		new SubY(100,200);
	}
}
