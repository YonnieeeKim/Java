package exam_array_in_array;

import java.util.Scanner;

public class StudentArrayExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] score = new int[3][4];
		String subject[] = new String[] { "국어", "영어", "수학", "총합", "평균" };
		double[] average = new double[3];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print(i + 1 + "번 학생의 " + subject[j] + "성적을 입력하세요.");
				score[i][j] = s.nextInt();
			}
		}
		s.close();

		for (int i = 0, avg = 4, sum = 3; i < score.length; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
				score[i][sum] += score[i][j];
			}
			average[i] = score[i][sum] / 3.0;
		}

		for (String sub : subject) {
			System.out.printf("%s\t", sub);
		}
		System.out.println("\n--------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
				
			}
			System.out.printf("%.1f\t", average[i]);
			System.out.println();
		}

	}
}
