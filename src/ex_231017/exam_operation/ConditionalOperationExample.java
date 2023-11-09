package ex_231017.exam_operation;


import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		System.out.println("두 수 중 최대값 : " + ((x > y) ? x : y));
		System.out.println("두 수 중 최대값 : " + Math.max(x, y));

		
		//임의의 수를 입력받아 짝수인지 홀수인지 출력
		Scanner a = new Scanner(System.in);
	
		System.out.print("수를 입력하세요. ");
		int i = a.nextInt();
		System.out.println(i + "는 " + ((i % 2 == 0) ? "짝수" : "홀수"));

		//두 수의 차(단 max-min)
		System.out.print("두 수를 입력하세요. ");
		int j = a.nextInt();
		int k = a.nextInt();
		
		System.out.println("두 수의 차는 " + (Math.max(j, k) - Math.min(j, k)));
		
		a.close();

	}

}

