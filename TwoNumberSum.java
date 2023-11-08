package exam_input;

import java.util.Scanner;

public class TwoNumberSum {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int x;
		int y;
		int sum;

		System.out.print("첫번째 숫자를 입력");
		x = a.nextInt();

		System.out.print("두번째 숫자를 입력");
		y = a.nextInt();

		sum = x + y;

		System.out.println("두 수의 합 : " + sum);

		a.close();
	}

}
