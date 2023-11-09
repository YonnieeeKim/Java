package ex_231017.example;

import java.util.Scanner;

public class GradeProgramming {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("중간고사, 기말고사, 레포트, 출석점수를 입력하세요");
		int middle = s.nextInt();
		int last = s.nextInt();
		int report = s.nextInt();
		int a = s.nextInt();

		double sum = 0;
		char grade;
		String message;

		sum = ((middle + last) / 2) * 0.6 + report * 0.2 + a * 0.2;

		if (sum >= 90)
			grade = 'A';
		else if (sum > 80)
			grade = 'B';
		else if (sum > 70)
			grade = 'C';
		else if (sum > 60)
			grade = 'D';
		else
			grade = 'F';

		switch (grade) {
		case 'A':
		case 'B':
			message = "excellent";
			break;
		case 'C':
		case 'D':
			message = "good";
			break;
		default:
			message = "poor";
			break;
		}

		System.out.println("----결과입니다-----");
		System.out.println("중간고사 : " + middle);
		System.out.println("기말고사 : " + last);
		System.out.println("레포트 : " + report);
		System.out.println("출석점수 : " + a);
		System.out.println();

		System.out.printf("성적 : %.2f\n", sum);
		System.out.println("평가 : " + message);

	}
}
