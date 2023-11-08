package exam_int;

import java.util.Scanner;

public class IntExample {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int num1, num2, tmp;

		//두 변수 선언 후 값 입력받아 값 교환 후 출력
		System.out.print("a 입력 ");
		num1 = a.nextInt();

		System.out.print("b 입력 ");
		num2 = a.nextInt();
		
		System.out.println("a : " + num1 + ", b : " + num2);

		tmp = num1;
		num1 = num2;
		num2 = tmp;

		System.out.println("a : " + num1 + ", b : " + num2);

		// 2개의 수 읽어서 a는 1증가 b는 1감소해 출력
		/*
		 * num1++; num2--;
		 * 
		 * System.out.println("a : "+num1); System.out.println("b : "+num2);
		 */

		a.close();
	}

}
