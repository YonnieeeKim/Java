package cafe_class_exam;

public class ScoreOX {
	private int no;
	private String name;
	private int[] dap = new int[5];
	private int cnt;
	private int score = 0;
	private int rank;
	public static int tot;
	private char[] c_ox = { 'x', 'x', 'x', 'x', 'x' };

	public int getScore() {
		return score;
	}

	public ScoreOX() {

	}

	public ScoreOX(int no, String name, int[] dap) {
		this.no = no;
		this.name = name;
		this.dap = dap;
	}

	public void compute() {

		for (int i = 0; i < dap.length; i++) {
			if (dap[i] == 1) {
				cnt++;
				tot++;
				score += 20;
				c_ox[i] = 'o';
			}
		}
	}

	public void display() {
		System.out.printf("%d\t%s\t", no, name);
		for (int i = 0; i < c_ox.length; i++) {
			System.out.printf("%s\t", c_ox[i]);
		}
		System.out.printf("%3d\t%d\n", score, rank);

	}

	public void show() {
		System.out.println("전체 맞은 개수 " + tot);
	}

	public static void ranking(ScoreOX[] sc) {

		for (int i = 0; i < 5; i++) {
			int rank = 1;
			for (int j = 0; j < 5; j++) {
				if (sc[i].getScore() <= sc[j].getScore()) {
					sc[i].rank++;
				}
			}
		}
	}
}
