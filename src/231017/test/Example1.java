package test;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수 입력, 총점과 평균(소수1자리) 출력
		Scanner s = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학 점수를 입력하세요.(0~100 사이의 점수");
		
		int ko = s.nextInt();
		int en = s.nextInt();
		int ma = s.nextInt();

		int sum = ko + en + ma;
		double avg = sum / 3;

		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", avg);

		s.close();

	}

}
