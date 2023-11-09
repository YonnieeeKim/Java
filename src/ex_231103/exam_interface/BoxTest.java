package ex_231103.exam_interface;

@SuppressWarnings("rawtypes")
class Box implements Comparable {
	private double volume;

	public double getVolume() {
		return volume;
	}

	public Box(double volume) {
		this.volume = volume;
	}

	@Override
	public int compareTo(Object o) {
		Box other = (Box) o;
		if (this.volume < other.volume)
			return -1;
		else if (this.volume > other.volume)
			return 1;
		else
			return 0;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box(33.4);
		Box b2 = new Box(22);
		

		if (b1.compareTo(b2)>0) {
			System.out.println("b1이 크다.");
		} else {
			System.out.println("b2가 크다.");
		}
	}
}
