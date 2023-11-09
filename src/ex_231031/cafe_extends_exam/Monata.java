package ex_231031.cafe_extends_exam;


public class Monata extends Car {
	private String series;
	private String use;

	public Monata(String color, int account, String use, String series) {
		super(color, account);
		this.series = series;
		this.use = use;
	} 

	public String toString() {
		String s = "\t[용도] " + use + "\t[시리즈] " + series;
		return super.toString() + s;
	}

}
