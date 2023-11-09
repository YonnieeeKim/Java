package ex_231025.exam_method;

class PrimitiveSwap {
	public void change(int x, int y) {
		System.out.println("\nBefore Change X = " + x + " Y = " + y);
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("\nAfter Change X = " + x + " Y = " + y);
	}
}

public class PrimitiveSwapTest {
	public static void main(String[] args) {
		PrimitiveSwap ps = new PrimitiveSwap();

		int x = 10;
		int y = 20;
		System.out.println("\n호출전 Main X = " + x + " Y = " + y);

		ps.change(x, y);
		System.out.println("\n호출후 Main X = " + x + " Y = " + y);
	}
}