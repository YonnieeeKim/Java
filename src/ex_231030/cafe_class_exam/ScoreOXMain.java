package ex_231030.cafe_class_exam;


public class ScoreOXMain {
	public static void main(String[] args) {
		ScoreOX sc[] = new ScoreOX[5];

		sc[0] = new ScoreOX(1, "홍길동", new int[] { 1, 2, 1, 3, 4 });
		sc[1] = new ScoreOX(2, "김철수", new int[] { 1, 1, 1, 1, 1 });
		sc[2] = new ScoreOX(3, "이진희", new int[] { 1, 2, 1, 3, 1 });
		sc[3] = new ScoreOX(4, "조현민", new int[] { 1, 1, 1, 3, 1 });
		sc[4] = new ScoreOX(5, "최현정", new int[] { 1, 4, 2, 5, 4 });

		for (int i = 0; i < sc.length; i++) {
			sc[i].compute();
		}

		ScoreOX.ranking(sc);

		System.out.println("---------------------------------------------------------------");
		System.out.println("번호\t이름\t1\t2\t3\t4\t5\t점수\t등수");
		System.out.println("---------------------------------------------------------------");

		for (int i = 0; i < sc.length; i++) {
			sc[i].display();
		}

		System.out.println("전체 맞은 개수 : " + sc[4].tot);

	}
}
