package ex_231024.exam_class_basic;


public class ScoreTest {
	public static void main(String[] args) {
		Score s0 = new Score();
		Score s1 = new Score();
		Score s2 = new Score();

		setData(s0);
		s0.getTotal();
		s0.getAverage();

		setData(s1);
		s1.getTotal();
		s1.getAverage();

		setData(s2);
		s2.getTotal();
		s2.getAverage();

		System.out.println("===================================================");
		String[] sub = { "이름", "국어", "영어", "수학", "총점", "평균", "학점" };
		for (int i = 0; i < sub.length; i++) {
			System.out.printf("%s\t", sub[i]);
		}
		System.out.println("\n===================================================");

		System.out.println(s0.show());
		System.out.println(s1.show());
		System.out.println(s2.show());
	}

	private static void setData(Score s0) {
		// TODO Auto-generated method stub
		
	}

}
