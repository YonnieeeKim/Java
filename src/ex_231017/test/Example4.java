package ex_231017.test;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		// 100~999숫자 입력받아 각자리의 수를 합한 합계 출력
		Scanner s = new Scanner(System.in);

		System.out.println("100~999사이의 숫자를 입력하세요.");

		int num = s.nextInt();
		int sum = 0;
		int i, j;
		
		i = num / 100;
		num -= i * 100;
		j = num / 10;
		num -= j * 10;

		sum = i + j + num;

		System.out.println(sum);

		s.close();
	}

}
