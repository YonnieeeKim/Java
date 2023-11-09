package ex_231017.exam_if;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char grade = 0;

		System.out.println("점수 입력");
		int score = s.nextInt();

		if (score > 100||score<0)
			System.out.println("입력범위 초과");
		else {
			if (score >= 90)
				grade = 'A';
			else if (score >= 80)
				grade = 'B';
			else if (score >= 70)
				grade = 'C';
			else if (score >= 60)
				grade = 'D';
			else
				grade = 'F';
		}

		System.out.println(grade);
		s.close();

		// if(score%2==0) System.out.println(score + "= 짝수");
		// else System.out.println(score + "= 홀수");
	}
}
