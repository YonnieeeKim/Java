package ex_231017.test;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		// x개의 사탕을 y명에게 똑같이 나눠줌
		// 각 학생들이 받는 수와 남는 수를 계산해 출력
		Scanner s = new Scanner(System.in);
		
		System.out.println("사탕의 개수를 입력하세요.");
		int x = s.nextInt();
		
		System.out.println("학생의 인원을 입력하세요.");
		int y = s.nextInt();

		System.out.println("각 학생들이 받는 사탕의 개수는 " + x / y + "개");
		System.out.println("남는 사탕의 개수는 " + x % y + "개");

		s.close();

	}

}
